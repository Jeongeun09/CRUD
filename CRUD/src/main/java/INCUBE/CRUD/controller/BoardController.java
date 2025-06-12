package INCUBE.CRUD.controller;


import INCUBE.CRUD.dto.BoardRequestDto;
import INCUBE.CRUD.dto.BoardResponseDto;
import INCUBE.CRUD.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {
    private final BoardService boardService;


    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/boards")
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto) {
        BoardResponseDto board = boardService.createBoard(requestDto);
        return board;
    }


    @GetMapping("/boards")
    public List<BoardResponseDto> getAllBoards() {
        return BoardService.findAllBoard();
    }

    @GetMapping("/board/{id}")
    public BoardResponseDto getOneBoard(@PathVariable Long id) {
        return BoardService.findOneBoard(String.valueOf(id));
    }

    @PutMapping("/board/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return BoardService.update(id, requestDto);
    }


    @DeleteMapping("/board/{id}")
    public Long deleteBoard(@PathVariable Long id) {
        return boardService.deleteBoard(id);
    }


    @GetMapping("/board/check/{id}/{inputPassword}")
    public boolean checkPassword(@PathVariable Long id, @PathVariable String inputPassword) {
        return boardService.checkPassword(id, inputPassword);
    }


}
