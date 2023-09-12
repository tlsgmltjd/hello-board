package helloBoard.demo.domain.Board;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Title;
    private String Content;
    private Long likes;

    public void addLikes() {
        this.likes = this.likes + 1;
    }
}
