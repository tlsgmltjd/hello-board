package helloBoard.demo.domain.BoardComment;

import helloBoard.demo.domain.Board.Board;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "boardcomment")
public class boardComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @JoinColumn(name = "board_id")
    @ManyToOne
    private Board board = new Board();
    private String author_name;
    private String Content;
    @CreationTimestamp
    private Timestamp date;

    public boardComment(Long boardId, String authorName, String content) {
        this.board.setId(boardId);
        this.author_name = authorName;
        Content = content;
    }

    public boardComment() {

    }
}
