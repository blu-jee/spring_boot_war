package com.example.demo;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class boardDTO {
    private int id;
    private String title;
    private LocalDateTime date;
    private String content;
    private int lock;
    private String password;
    private String salt;

}
