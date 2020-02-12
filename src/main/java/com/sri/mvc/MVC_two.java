package com.sri.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MVC_two {
	public MVC_two() {
		System.out.println("created mvc two");
	}
	@RequestMapping("/t1.do")
	public String itis() {
		System.out.println("invoked itis");
		return "/index.jsp";
	}
}
