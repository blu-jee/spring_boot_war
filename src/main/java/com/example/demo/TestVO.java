package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class TestVO{
	public static void main(String args[]) throws Exception{
		User user = new User();
		user.setName("hong");
		user.setTestNum(1);
		user.setTest("test");
		System.out.println("jjjjj");
		System.out.println(user.toString());
	}
}

@Data
@Getter
@Setter
class User {
	String test;
	int testNum;
	private String name;
}

