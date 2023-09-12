package helloBoard.demo.service.BoardComment;

import helloBoard.demo.repository.BoardComment.BoardCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardCommentService {
    @Autowired
    BoardCommentRepository boardCommentRepository;
}
