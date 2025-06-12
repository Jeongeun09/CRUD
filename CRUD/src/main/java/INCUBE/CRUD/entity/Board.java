package INCUBE.CRUD.entity;


import timestamped.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@Entity(name = "users")

public class Board<BoardRequestDto> extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long Id;

    // 제목
    @Column(nullable = false)
    private String title;
    private String content;
    private String password;

    public Board(INCUBE.CRUD.dto.BoardRequestDto requestDto) {
        super();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPassword() {
        return password;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public LocalDateTime getCreateAt() {
        return null;
    }

    public LocalDateTime getModifiedAt() {
        return null;
    }

    public void update(INCUBE.CRUD.dto.BoardRequestDto requestDto) {



    }
}
