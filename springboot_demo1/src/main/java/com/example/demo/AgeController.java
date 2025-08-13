package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
	@RequestMapping(value = "/birthday/{year}/{month}/{day}")
	public long  showAge(@PathVariable("year") int year, @PathVariable("month") int month, @PathVariable("day") int day) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	    LocalDate  birthDate = LocalDate.of(year, month, day);
	    LocalDate  currentDate = LocalDate.now();
	    long age = ChronoUnit.YEARS.between(birthDate, currentDate);
	    return age;
	    }
}
