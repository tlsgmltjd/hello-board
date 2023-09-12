package helloBoard.demo.repository.Board;

import helloBoard.demo.domain.Board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
