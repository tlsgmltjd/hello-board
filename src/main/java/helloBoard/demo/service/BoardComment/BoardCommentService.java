package helloBoard.demo.service.BoardComment;

import helloBoard.demo.domain.BoardComment.boardComment;
import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.dto.BoardComment.response.BoardCommentGetResponse;
import helloBoard.demo.repository.BoardComment.BoardCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardCommentService {
    @Autowired
    BoardCommentRepository boardCommentRepository;

    @Transactional
    public void saveComment(Long boardId, BoardCommentCreateRequest boardCommentCreateRequest) {
        if (boardId == null || boardCommentCreateRequest.getContent().isBlank() || boardCommentCreateRequest.getAuthorName().isBlank()) {
            throw new IllegalArgumentException();
        }

        boardComment boardComment = new boardComment(boardId, boardCommentCreateRequest.getAuthorName(), boardCommentCreateRequest.getContent());
        boardCommentRepository.save(boardComment);
    }

    @Transactional
    public List<BoardCommentGetResponse> getComment(Long board_id) {
        List<boardComment> boardComments = boardCommentRepository.findByBoardId(board_id).orElseThrow(IllegalArgumentException::new);
        List<BoardCommentGetResponse> boardCommentGetResponse = new ArrayList<>();

        for (boardComment b : boardComments) {
            BoardCommentGetResponse boardComment = new BoardCommentGetResponse(b.getId(), b.getAuthor_name(), b.getContent(), b.getDate());
            boardCommentGetResponse.add(boardComment);
        }

        return boardCommentGetResponse;
    }
}
