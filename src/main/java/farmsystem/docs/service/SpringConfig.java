package farmsystem.docs.service;

import farmsystem.docs.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final BoardRepository boardRepository;

    @Autowired
    public SpringConfig(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Bean
    public BoardService boardService() {return new BoardService(boardRepository); }
}
