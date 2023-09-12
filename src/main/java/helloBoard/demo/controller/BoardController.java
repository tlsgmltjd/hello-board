package helloBoard.demo.controller;

import helloBoard.demo.dto.Board.request.BoardCreateRequest;
import helloBoard.demo.service.Board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("/post")
    public void saveBoard(@RequestBody BoardCreateRequest boardCreateRequest) { boardService.saveBoard(boardCreateRequest); }
}
