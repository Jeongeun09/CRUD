package INCUBE.CRUD.service;

import INCUBE.CRUD.dto.BoardRequestDto;
import INCUBE.CRUD.dto.BoardResponseDto;
import INCUBE.CRUD.entity.Board;
import INCUBE.CRUD.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class  BoardService {
    private static final BoardRepository boardRepository = null;

    public static Long update(Long id, BoardRequestDto requestDto) {
        return id;
    }


    public BoardResponseDto createBoard(BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        boardRepository.save(board);
        return new BoardResponseDto(board);
    }
    public static List<BoardResponseDto> findAllBoard() {
        try{
            List<Board> boardList = boardRepository.findAll();

            List<BoardResponseDto> responseDtoList = new ArrayList<>();

            for (Board board : boardList) {
                responseDtoList.add(
                        new BoardResponseDto()
                );
            }
            return responseDtoList;
        }catch (Exception e) {

        }
        return null;
    }
    public static BoardResponseDto findOneBoard(String id) {
        Board board = boardRepository.findById(Long.valueOf(id)).orElseThrow(
            () -> new IllegalArgumentException("조회 실패")
        );
        return new BoardResponseDto(board);
    }
    @Transactional
    public Long updateBoard(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return board.getId();
    }
    @Transactional
    public Long delete(Long id) {
        boardRepository.deleteById(id);
        return id;
    }

    public Long deleteBoard(Long id) {
        return id;
    }

    public boolean checkPassword(Long id, String inputPassword) {
        return false;
    }
}