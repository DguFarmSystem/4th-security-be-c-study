package com.example.myboard.service;

import com.example.myboard.dto.BoardDTO;
import com.example.myboard.entity.Board;
import com.example.myboard.repository.BoardRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public BoardDTO createBoard(String title, String content) {
        Board board = new Board(title, content);
        boardRepository.save(board);
        return new BoardDTO(board.getId(), board.getTitle(), board.getContent(), board.getCreatedAt(), board.getUpdatedAt());
    }

    public List<BoardDTO> getAllBoards() {
        return boardRepository.findAll().stream()
                .map(board -> new BoardDTO(board.getId(), board.getTitle(), board.getContent(), board.getCreatedAt(), board.getUpdatedAt()))
                .collect(Collectors.toList());
    }

    public BoardDTO getBoardById(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new RuntimeException("게시글이 존재하지 않습니다."));
        return new BoardDTO(board.getId(), board.getTitle(), board.getContent(), board.getCreatedAt(), board.getUpdatedAt());
    }

    public BoardDTO updateBoard(Long id, String title, String content) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new RuntimeException("게시글이 존재하지 않습니다."));
        board.setTitle(title);
        board.setContent(content);
        board.setUpdatedAt(java.time.LocalDateTime.now());
        boardRepository.save(board);
        return new BoardDTO(board.getId(), board.getTitle(), board.getContent(), board.getCreatedAt(), board.getUpdatedAt());
    }

    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}
