package helloBoard.demo.service.Board;

import helloBoard.demo.domain.Board.Board;
import helloBoard.demo.dto.Board.request.BoardCreateRequest;
import helloBoard.demo.repository.Board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    @Transactional
    public void saveBoard(BoardCreateRequest boardCreateRequest) {
        if (boardCreateRequest.getTitle().isEmpty() || boardCreateRequest.getContent().isEmpty()) throw new IllegalArgumentException();
        Board board = new Board();
        board.setTitle(boardCreateRequest.getTitle());
        board.setContent(boardCreateRequest.getContent());
        boardRepository.save(board);
    }
}
