package helloBoard.demo.repository.BoardComment;

import helloBoard.demo.domain.BoardComment.BoardComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardCommentRepository extends JpaRepository<BoardComment, Long> {
}
