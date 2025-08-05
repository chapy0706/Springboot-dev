package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmikujiController {

    private final List<String> fortunes = List.of(
        "大吉", "吉", "吉", "吉", "小吉", "凶"
    );

    private final Random random = new Random();

    @GetMapping("/omikuji")
    public String omikuji() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}