package INCUBE.CRUD.dto;

import INCUBE.CRUD.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardResponseDto {
    private String title;
    private String content;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public BoardResponseDto(Board board, LocalDateTime modifiedAt) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.modifiedAt = board.getCreateAt();
        this.createAt = board.getModifiedAt();

    }

    public BoardResponseDto(Board board) {
    }
}
