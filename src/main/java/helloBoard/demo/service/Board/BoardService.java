package helloBoard.demo.service.Board;

import helloBoard.demo.domain.Board.Board;
import helloBoard.demo.dto.Board.request.BoardCreateRequest;
import helloBoard.demo.dto.Board.response.BoardGetResponse;
import helloBoard.demo.repository.Board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    @Transactional
    public List<BoardGetResponse> getBoards() {
        List<Board> boards = boardRepository.findAll();
        List<BoardGetResponse> boardResponses = new ArrayList<>();

        for (Board b : boards) {
            BoardGetResponse boardGetResponse = new BoardGetResponse(b.getId(), b.getTitle());
            boardResponses.add(boardGetResponse);
        }

        return boardResponses;
    }
}
