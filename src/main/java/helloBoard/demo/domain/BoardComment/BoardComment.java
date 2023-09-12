package helloBoard.demo.domain.BoardComment;

import helloBoard.demo.domain.Board.Board;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Data
public class BoardComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long boardId;
    private String authorName;
    private String Content;
    @CreationTimestamp
    private Timestamp date;
}
