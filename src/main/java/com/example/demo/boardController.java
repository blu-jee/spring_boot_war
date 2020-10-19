package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class boardController {
	@Autowired
	private boardService boardService;

	@RequestMapping("/index")
	public ModelAndView boardJsp() throws Exception
	{
		ModelAndView mvn = new ModelAndView();
		mvn.setViewName("index");
		int count = boardService.boardCount();
		mvn.addObject("count", count);
		return mvn;
	}

	@RequestMapping("/")
	public ModelAndView list(Model model) throws Exception {
		ModelAndView mvn = new ModelAndView();
		mvn.setViewName("board");
		mvn.addObject("list", boardService.getBoardList());
		return mvn;
	}

	@GetMapping("/post")
	public String write()
	{
		return "write";
	}

	@PostMapping("/post")
	public String write(@ModelAttribute("boardDTO") boardDTO board) throws Exception{
		boardService.savePost();
		return "redirect:/";
	}

//	@PostMapping("/post")
//	public ModelAndView write(Model model) throws Exception {
//		ModelAndView mvn = new ModelAndView();
//		mvn.setViewName("redirect:/");
//		mvn.addObject("write", boardService.savePost());
//		return mvn;
//	}
}
