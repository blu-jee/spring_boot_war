package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class boardServiceImpl implements boardService {

    @Autowired
    private boardMapper boardMapper;

    @Override
    public int boardCount() throws Exception {
        return boardMapper.boardCount();
    }

    @Override
    public List<boardDTO> getBoardList() throws Exception{
        return boardMapper.getBoardList();
    }

    @Override
    public String savePost() throws Exception{
        return boardMapper.savePost();
    }

//    @Override
//    public List<boardDTO> getBoardList() {
//        List<boardEntity> boardEntities = boardRepository.findAll();
//        List<boardDTO> boardDTOList = new ArrayList<>();
//        return boardDTOList;
//
//    }
}
