package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RESTコントローラーとして登録
public class SumController {

    @RequestMapping(value = "/sum/{num}")
    public int sum(@PathVariable("num") int num) {

        int sum = 0;
        for (int i = 1; i <= num; ++i) {
            sum = sum + i;
        }

        return sum; // 合計値を返す
    }
}
