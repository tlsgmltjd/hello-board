package helloBoard.demo.domain.Board;

import helloBoard.demo.domain.BoardComment.boardComment;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<boardComment> boardComments = new ArrayList<>();
    private String Title;
    private String Content;
    private Long likes;

    public void addLikes() {
        this.likes = this.likes + 1;
    }

    public void createBoard(String title, String content) {
        Title = title;
        Content = content;
        this.likes = 0L;
    }

    public void updataBoard(String title, String content) {
        Title = title;
        Content = content;
    }
}
