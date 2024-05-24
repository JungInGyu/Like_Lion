package org.example.notic_project.controller;

import lombok.RequiredArgsConstructor;
import org.example.notic_project.domain.Board;
import org.example.notic_project.service.BoardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list(Model model, @RequestParam(defaultValue = "1")int page,
                       @RequestParam(defaultValue = "5") int size){
        Pageable pageable = PageRequest.of(page -1 , size);

        Page<Board> boards = boardService.findAllBoards(pageable);
        model.addAttribute("boards",boards);
        model.addAttribute("currentPage",page);
        return "board/list";
    }

    @GetMapping("/view/{id}")
    public String view(){
        return "view";
    }

    @GetMapping("/writeform")
    public String writerForm(){
        return "writeform";
    }

    @GetMapping("/deleteform")
    public String deleteForm(){
        return "deleteform";
    }

    @GetMapping("updateform")
    public String updateform(){
        return "updateform";
    }
}
