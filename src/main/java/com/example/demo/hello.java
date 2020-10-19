package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class hello {
	@RequestMapping("/jsp")
	public String jsp(){
		System.out.println("hi");
		return "index";

	}

}
