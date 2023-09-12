package helloBoard.demo.dto.Board.response;

import lombok.Data;

@Data
public class BoardGetResponse {
    private long id;
    private String title;

    public BoardGetResponse(long id, String title) {
        this.id = id;
        this.title = title;
    }
}
