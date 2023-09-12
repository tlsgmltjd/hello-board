package helloBoard.demo.controller;

import helloBoard.demo.domain.Board.Board;
import helloBoard.demo.dto.Board.request.BoardCreateRequest;
import helloBoard.demo.dto.Board.request.BoardUpdateRequest;
import helloBoard.demo.dto.Board.response.BoardGetResponse;
import helloBoard.demo.dto.Board.response.BoardInfoResponse;
import helloBoard.demo.service.Board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("/post")
    public void saveBoard(@RequestBody BoardCreateRequest boardCreateRequest) { boardService.saveBoard(boardCreateRequest); }

    @GetMapping("/get")
    public List<BoardGetResponse> getBoards() { return boardService.getBoards(); }

    @GetMapping("/info")
    public BoardInfoResponse getBoard(@RequestParam Long id) { return boardService.getBoard(id); }

    @DeleteMapping("/delete")
    public void deleteBoard(@RequestParam Long id) { boardService.deleteBoard(id); }

    @PutMapping("/update")
    public void updateBoard(@RequestBody BoardUpdateRequest boardUpdateRequest) { boardService.updateBoard(boardUpdateRequest); }

    @GetMapping("/like")
    public void likesBoard(@RequestParam Long id) { boardService.likesBoard(id); }
}
