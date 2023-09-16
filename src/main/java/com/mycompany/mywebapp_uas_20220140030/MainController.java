package com.mycompany.mywebapp_uas_20220140030;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage() {
        return "index";
    }
}
