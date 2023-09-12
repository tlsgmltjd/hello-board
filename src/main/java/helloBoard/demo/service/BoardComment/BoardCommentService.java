package helloBoard.demo.service.BoardComment;

import helloBoard.demo.domain.BoardComment.boardComment;
import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.repository.BoardComment.BoardCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardCommentService {
    @Autowired
    BoardCommentRepository boardCommentRepository;

    @Transactional
    public void saveComment(Long id, BoardCommentCreateRequest boardCommentCreateRequest) {
        if (id == null || boardCommentCreateRequest.getContent().isEmpty() || boardCommentCreateRequest.getAuthorName().isEmpty())
            throw new IllegalArgumentException();

        boardComment boardComment = new boardComment(id, boardCommentCreateRequest.getAuthorName(), boardCommentCreateRequest.getContent());
        boardCommentRepository.save(boardComment);
    }
}
