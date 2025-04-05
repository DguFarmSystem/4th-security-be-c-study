package farmsystem.docs.repository;

import farmsystem.docs.domain.BoardEntity;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    BoardEntity save(BoardEntity boardEntity);
    Optional<BoardEntity> findById(Long id);
    List<BoardEntity> findByTitle(String title);
    List<BoardEntity> findAll();
    void deleteById(Long id);
}
