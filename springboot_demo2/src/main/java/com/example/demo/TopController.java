package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	
	@RequestMapping("/withDate")
	public ModelAndView topWithDate(ModelAndView mv){
	 mv.setViewName("topWithDate");

	 LocalDateTime currentDate = LocalDateTime.now();
	 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	 mv.addObject("currentDate",currentDate.format(fmt));

	 return mv;
	}
}