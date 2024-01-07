package com.springdemo.hellojava;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {
    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "Hello, this is about page!";
    }
}
