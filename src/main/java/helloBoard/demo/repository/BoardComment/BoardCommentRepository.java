package helloBoard.demo.repository.BoardComment;

import helloBoard.demo.domain.BoardComment.boardComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardCommentRepository extends JpaRepository<boardComment, Long> {
}
