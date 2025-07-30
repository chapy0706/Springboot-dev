package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
 @RequestMapping(value = "/after", method = RequestMethod.POST)
 public String show(@RequestParam("daysParameter") int days) {
  LocalDateTime currentDate = LocalDateTime.now();
  LocalDateTime date = currentDate.plusDays(days);
  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
  return date.format(fmt);
 }
}