package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
// @RequestMapping("/hello")
// public String show() {
//  return "Hello!!";
// }
// 
// @RequestMapping(value = "/hello", method = RequestMethod.POST)
// public String show(@RequestParam("nameParameter") String name, @RequestParam("numOfTimes") int numberOfTimes) {
//  StringBuilder sb = new StringBuilder();
//  for (int i = 0; i < numberOfTimes; i++) {
//   sb.append(name + "さんこんにちは!<br>");
//  }
//  return sb.toString();
// }

   @RequestMapping(value = "/hello/{name}/{age}")
   public String helloQueryString(@PathVariable("name") String name, @PathVariable("age") int age) {
	 age = age + 10; // ageを10年後として設定する
	 return "こんにちは" + name + "さん。10年後は" + age + "歳ですね!";
   }
}