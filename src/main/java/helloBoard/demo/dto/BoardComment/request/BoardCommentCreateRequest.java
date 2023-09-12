package helloBoard.demo.dto.BoardComment.request;

import lombok.Data;

@Data
public class BoardCommentCreateRequest {
    private long id;
    private String Content;
    private String authorName;
}
