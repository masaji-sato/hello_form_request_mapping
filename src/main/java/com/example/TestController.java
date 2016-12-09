package com.example;

import com.example.test.A;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    String get() {
        return "test";
    }

    @PostMapping(value = "/test")
    String post(@ModelAttribute A a) {
        return "test";
    }
}
