package INCUBE.CRUD.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class BoardRequestDto {

    private String title;
    private String content;
    private String password;

}
