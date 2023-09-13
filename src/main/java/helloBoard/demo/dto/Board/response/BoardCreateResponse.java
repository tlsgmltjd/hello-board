package helloBoard.demo.dto.Board.response;

import lombok.Data;

@Data
public class BoardCreateResponse {
    private long id;
    private String title;
    private long likes;

    public BoardCreateResponse(long id, String title, long likes) {
        this.id = id;
        this.title = title;
        this.likes = likes;
    }
}
