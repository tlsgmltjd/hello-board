package helloBoard.demo.dto.Board.response;

import lombok.Data;

@Data
public class BoardGetResponse {
    private long id;
    private String title;
    private long likes;

    public BoardGetResponse(long id, String title, long likes) {
        this.id = id;
        this.title = title;
        this.likes = likes;
    }
}
