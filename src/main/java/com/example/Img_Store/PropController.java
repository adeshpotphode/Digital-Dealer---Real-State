package com.example.Img_Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PropController {
    
    @Autowired
    PropService ps;

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
    public String contact(Model model)
    {
        Prop prop = new Prop();
        model.addAttribute("prop", prop);
        return "contact";
    }

    @PostMapping("/SaveVisiter")
    public String saveVisiter(@ModelAttribute("prop") Prop prop)
    {
        ps.save(prop);
        return"redirect:/Contact";
    }
    
     @GetMapping("/VisiterListAdmin")
     public String data(Model model)
     {
         model.addAttribute("allInquiriesList", ps.getAllInquiries());
         return "visiterlist";
     }
}

