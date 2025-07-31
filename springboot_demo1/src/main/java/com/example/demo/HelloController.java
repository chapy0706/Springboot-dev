package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 @RequestMapping("/hello")
 public String show() {
  return "Hello!!";
 }
 
 @RequestMapping(value = "/hello", method = RequestMethod.POST)
 public String show(@RequestParam("nameParameter") String name, @RequestParam("numOfTimes") int numberOfTimes) {
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < numberOfTimes; i++) {
   sb.append(name + "さんこんにちは!<br>");
  }
  return sb.toString();
 }
}