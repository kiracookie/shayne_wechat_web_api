package com.shayne.wechat.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/login")
    public String sayHello() {
        return "login";
    }
}
