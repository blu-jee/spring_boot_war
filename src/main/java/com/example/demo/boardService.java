package com.example.demo;

import java.util.List;

public interface boardService {
    int boardCount() throws Exception;

    List<boardDTO> getBoardList() throws Exception;

    String savePost() throws Exception;
//    List<boardDTO> getBoardList();

}
