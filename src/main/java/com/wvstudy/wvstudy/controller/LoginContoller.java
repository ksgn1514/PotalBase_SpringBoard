package com.wvstudy.wvstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginContoller {

    @GetMapping("/")
    public String index() {

		return "content/login";
	}
}
