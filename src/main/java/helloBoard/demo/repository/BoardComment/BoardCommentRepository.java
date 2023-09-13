package helloBoard.demo.repository.BoardComment;

import helloBoard.demo.domain.BoardComment.boardComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardCommentRepository extends JpaRepository<boardComment, Long> {
    Optional<List<boardComment>> findByBoardId(Long board_id);
}
