package helloBoard.demo.controller;

import helloBoard.demo.domain.Board.Board;
import helloBoard.demo.dto.Board.request.BoardCreateRequest;
import helloBoard.demo.dto.Board.request.BoardUpdateRequest;
import helloBoard.demo.dto.Board.response.BoardGetResponse;
import helloBoard.demo.dto.Board.response.BoardInfoResponse;
import helloBoard.demo.dto.BoardComment.request.BoardCommentCreateRequest;
import helloBoard.demo.service.Board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BoardController {

    @Autowired
    BoardService boardService;

    // 게시글 작성하기
    @PostMapping("/post")
    public void saveBoard(@RequestBody BoardCreateRequest boardCreateRequest) { boardService.saveBoard(boardCreateRequest); }

    // 게시글 가져오기
    @GetMapping("/get")
    public List<BoardGetResponse> getBoards() { return boardService.getBoards(); }

    // 게시글 상세 보기
    @GetMapping("/info")
    public BoardInfoResponse getBoard(@RequestParam Long id) { return boardService.getBoard(id); }

    // 게시글 삭제
    @DeleteMapping("/delete")
    public void deleteBoard(@RequestParam Long id) { boardService.deleteBoard(id); }

    // 게시글 수정
    @PutMapping("/update")
    public void updateBoard(@RequestBody BoardUpdateRequest boardUpdateRequest) { boardService.updateBoard(boardUpdateRequest); }

    // 좋아요 기능
    @GetMapping("/like")
    public void likesBoard(@RequestParam Long id) { boardService.likesBoard(id); }
}
