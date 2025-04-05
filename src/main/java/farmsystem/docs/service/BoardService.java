package farmsystem.docs.service;

import farmsystem.docs.controller.BoardDto;
import farmsystem.docs.domain.BoardEntity;
import farmsystem.docs.repository.BoardRepository;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) { this.boardRepository = boardRepository; }

    public void saveBoard(BoardDto boardDto) {
        BoardEntity boardEntity = boardDto.toEntity();
        boardRepository.save(boardEntity);
    }

    private List<BoardDto> convertToDtoList(List<BoardEntity> boardEntityList) {
        List<BoardDto> boardDtoList = new ArrayList<>();
        for (BoardEntity boardEntity : boardEntityList) {
            BoardDto boardDto = BoardDto.builder()
                    .id(boardEntity.getId())
                    .title(boardEntity.getTitle())
                    .content(boardEntity.getContent())
                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    public List<BoardDto> findAllBoards() {
        List<BoardEntity> boardEntityList = boardRepository.findAll();
        return convertToDtoList(boardEntityList);
    }

    public List<BoardDto> findBoardsByTitle(String title) {
        List<BoardEntity> boardEntityList = boardRepository.findByTitle(title);
        return convertToDtoList(boardEntityList);
    }

    public void updateBoard(BoardDto boardDto) {
        BoardEntity boardEntity = boardRepository.findById(boardDto.getId()).orElse(null);
        if(boardEntity != null) {
            boardEntity.setTitle(boardDto.getTitle());
            boardEntity.setContent(boardDto.getContent());
        }
    }

    public void deleteById(Long id) {
        boardRepository.deleteById(id);
    }
}
