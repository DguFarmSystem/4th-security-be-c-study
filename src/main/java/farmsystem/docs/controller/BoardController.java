package farmsystem.docs.controller;

import farmsystem.docs.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping(value = {"/","home"})
    public String home(Model model) {

        return "home";
    }

    @GetMapping("/post")
    public String createPostForm(){
        return "board/post";
    }

    @PostMapping("/post")
    public String create(@ModelAttribute BoardDto boardDto) {
        boardService.saveBoard(boardDto);

        return "redirect:/home";
    }

    @GetMapping("/board")
    public String boardList(@RequestParam(value = "title",required = false) String title, Model model) {
        List<BoardDto> boardDtoList;

        if(title != null && !title.isEmpty()){
            boardDtoList = boardService.findBoardsByTitle(title);
        } else {
            boardDtoList = boardService.findAllBoards();
        }
        model.addAttribute("boardList", boardDtoList);
        return "board/board";
    }

    @PostMapping("board/update/{id}")
    public String updateBoard(@PathVariable("id") Long id, @ModelAttribute BoardDto boardDto) {
        boardDto.setId(id);
        boardService.updateBoard(boardDto);
        return "redirect:/board";
    }

    @PostMapping("board/delete/{id}")
    public String deleteBoard(@PathVariable("id") Long id){
        boardService.deleteById(id);
        return "redirect:/board";
    }
}
