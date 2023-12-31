package helloBoard.demo.dto.Board.response;

import lombok.Data;

@Data
public class BoardInfoResponse {
    private long id;
    private String title;
    private String content;
    private long likes;

    public BoardInfoResponse(long id, String title, String content, long likes) {
        this.id = id;
        this.title = title;;
        this.content = content;
        this.likes = likes;
    }
}
