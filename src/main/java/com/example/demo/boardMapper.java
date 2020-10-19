package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardMapper {
    int boardCount() throws Exception;
    List<boardDTO> getBoardList() throws Exception;
    String savePost() throws Exception;
}
