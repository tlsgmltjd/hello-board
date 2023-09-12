package helloBoard.demo.controller;


import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.service.BoardComment.BoardCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BoardCommentController {

    @Autowired
    BoardCommentService boardCommentService;

    @PostMapping("/post/comment")
    public void saveComment(@RequestParam Long id, @RequestBody BoardCommentCreateRequest boardCommentCreateRequest) {
        boardCommentService.saveComment(id, boardCommentCreateRequest);
    }
}
