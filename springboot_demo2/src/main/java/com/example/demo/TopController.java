package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopController {
	@RequestMapping("/top")
	
    public ModelAndView top(ModelAndView mv) {
		mv.setViewName("top");
		return mv;
    }
}