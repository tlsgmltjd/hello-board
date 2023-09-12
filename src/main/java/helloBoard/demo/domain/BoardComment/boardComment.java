package helloBoard.demo.domain.BoardComment;

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
    private Long board_id;
    private String author_name;
    private String Content;
    @CreationTimestamp
    private Timestamp date;

    public boardComment(Long boardId, String authorName, String content) {
        this.board_id = boardId;
        this.author_name = authorName;
        Content = content;
    }

    public boardComment() {

    }
}
