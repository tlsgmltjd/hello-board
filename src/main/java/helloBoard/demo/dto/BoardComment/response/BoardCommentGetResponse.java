package helloBoard.demo.dto.BoardComment.response;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardCommentGetResponse {
    private Long id;
    private String author_name;
    private String content;
    private Timestamp date;

    public BoardCommentGetResponse(Long id, String author_name, String content, Timestamp date) {
        this.id = id;
        this.author_name = author_name;
        this.content = content;
        this.date = date;
    }
}
