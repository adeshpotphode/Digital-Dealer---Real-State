package com.example.Img_Store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PropController {
    
    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    @GetMapping("/AboutUs")
    public String aboutUs()
    {
        return "aboutUs";
    }
    @GetMapping("/Services")
    public String services()
    {
        return "services";
    }
    @GetMapping("/Projects")
    public String projects()
    {
        return "projects";
    }
    @GetMapping("/Contact")
    public String contact()
    {
        return "contact";
    }
}

