package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	 public ModelAndView login(ModelAndView mv){
		// ¶¯Ì¬Ìø×ªÒ³Ãæ
		mv.setViewName("/sys/welcome");
		return mv;
	}
}
