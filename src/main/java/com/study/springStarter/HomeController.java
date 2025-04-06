package com.study.springStarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "springboot"; // templates/springboot.html을 보여줌
    }
}
