package ru.crackedglass.ComSetupTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public @ResponseBody String getMethodName(@RequestParam String param) {
        return String.format("Hello, %s!", param);
    }

}
