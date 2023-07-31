package com.wevwkendportal.wevwkendportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginContoller {

    @GetMapping("/")
    public String dog() {

		return "content/login";
	}
}
