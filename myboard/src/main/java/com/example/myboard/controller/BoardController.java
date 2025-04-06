package com.example.myboard.controller;

import com.example.myboard.dto.BoardDTO;
import com.example.myboard.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public BoardDTO createBoard(@RequestParam String title, @RequestParam String content) {
        return boardService.createBoard(title, content);
    }

    @GetMapping
    public List<BoardDTO> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public BoardDTO getBoardById(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }

    @PatchMapping("/{id}")
    public BoardDTO updateBoard(@PathVariable Long id, @RequestParam String title, @RequestParam String content) {
        return boardService.updateBoard(id, title, content);
    }

    @DeleteMapping("/{id}")
    public String deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return "게시글이 삭제되었습니다.";
    }
}
