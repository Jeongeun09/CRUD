package INCUBE.CRUD.dto;

import INCUBE.CRUD.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {
    private String title;


    private String username;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public BoardListResponseDto(Board board) {
        this.title = board.getTitle();
        this.createAt = board.getModifiedAt();
        this.modifiedAt = board.getCreateAt();
    }

    public BoardListResponseDto(Optional<Board> board) {
        this.title = board.get().getTitle();
        this.createAt = board.get().getModifiedAt();
        this.modifiedAt = board.get().getCreateAt();
    }


}
