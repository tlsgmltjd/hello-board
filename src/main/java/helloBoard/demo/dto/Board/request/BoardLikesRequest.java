package helloBoard.demo.dto.Board.request;

import lombok.Data;

@Data
public class BoardLikesRequest {
    private Long boardId;

    public BoardLikesRequest(Long boardId) {
        this.boardId = boardId;
    }

    public BoardLikesRequest() {
    }
}
