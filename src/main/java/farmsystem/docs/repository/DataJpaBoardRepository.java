package farmsystem.docs.repository;

import farmsystem.docs.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataJpaBoardRepository extends JpaRepository<BoardEntity, Long>, BoardRepository {

    @Override
    List<BoardEntity> findByTitle(String title);
}
