package helloBoard.demo.dto.Board.request;

import lombok.Data;

@Data
public class BoardUpdateRequest {
    private long id;
    private String Title;
    private String Content;
}
