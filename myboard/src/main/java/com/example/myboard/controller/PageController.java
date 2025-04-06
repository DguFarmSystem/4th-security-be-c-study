package com.example.myboard.controller;

import com.example.myboard.dto.BoardDTO;
import com.example.myboard.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/boards") // 이걸로 모든 경로가 /boards로 시작함
public class PageController {

    private final BoardService boardService;

    public PageController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 게시글 목록 보기 - board-list.html
    @GetMapping
    public String boardList(Model model) {
        List<BoardDTO> boards = boardService.getAllBoards();
        model.addAttribute("boards", boards);
        return "board-list"; // templates/board-list.html
    }

    // 게시글 상세 보기 - board-detail.html
    @GetMapping("/{id}")
    public String boardDetail(@PathVariable Long id, Model model) {
        BoardDTO board = boardService.getBoardById(id);
        model.addAttribute("board", board);
        return "board-detail"; // templates/board-detail.html
    }

    // 게시글 작성 폼 - board-form.html
    @GetMapping("/new")
    public String createForm() {
        return "board-form"; // templates/board-form.html
    }

    // 게시글 작성 처리
    @PostMapping
    public String createBoard(@RequestParam String title, @RequestParam String content) {
        boardService.createBoard(title, content);
        return "redirect:/boards"; // 작성 후 목록으로 이동
    }

    // ✨ 수정 폼 보여주기
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        BoardDTO board = boardService.getBoardById(id);
        model.addAttribute("board", board);
        return "board-form";  // 기존 작성 폼 재사용
    }

    // ✨ 수정 내용 반영
    @PostMapping("/edit/{id}")
    public String updateBoard(@PathVariable Long id,
                              @RequestParam String title,
                              @RequestParam String content) {
        boardService.updateBoard(id, title, content);
        return "redirect:/boards/" + id;
    }

    // ✨ 삭제 처리
    @GetMapping("/delete/{id}")
    public String deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return "redirect:/boards";
    }
}