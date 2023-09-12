package helloBoard.demo.dto.Board.request;

import lombok.Data;

@Data
public class BoardCreateRequest {
    private String title;
    private String content;
}
