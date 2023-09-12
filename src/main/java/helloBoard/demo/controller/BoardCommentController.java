package helloBoard.demo.controller;


import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.service.Board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BoardCommentController {

    @Autowired
    BoardService boardService;

    @PostMapping("/post/comment")
    public void saveComment(@RequestParam Long id, @RequestBody BoardCommentCreateRequest boardCommentCreateRequest) {
        System.out.println("====================");
        System.out.println(id);
        System.out.println(boardCommentCreateRequest);
    }
}
