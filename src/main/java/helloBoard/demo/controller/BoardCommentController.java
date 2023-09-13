package helloBoard.demo.controller;


import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.dto.BoardComment.response.BoardCommentGetResponse;
import helloBoard.demo.service.BoardComment.BoardCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardCommentController {

    @Autowired
    BoardCommentService boardCommentService;

    @PostMapping("/post/comment")
    public void saveComment(@RequestParam Long boardId, @RequestBody BoardCommentCreateRequest boardCommentCreateRequest) {
        boardCommentService.saveComment(boardId, boardCommentCreateRequest);
    }

    @GetMapping("/get/comment")
    public List<BoardCommentGetResponse> getComment(@RequestParam Long boardId) {
        return boardCommentService.getComment(boardId);
    }
}
