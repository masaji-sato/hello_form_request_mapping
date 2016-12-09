package com.example;

import com.example.p.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    String get(Model model) {
        return "test";
    }

    @PostMapping(value = "/test")
    String post(@ModelAttribute A a) {
        return "test";
    }
}
