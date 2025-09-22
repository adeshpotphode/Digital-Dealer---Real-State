package com.example.Img_Store;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ImgController {
    @Autowired
    ImgService imgser;

    
    @GetMapping("/For-Sale")
    public String for_Sale(Model model) {
        model.addAttribute("user", new Img());
        return "for-sale";
    }

    @PostMapping("/Save")
    public String save(@ModelAttribute Img i, @RequestParam("userimage") MultipartFile imageFile)
    throws IOException {
            if (imageFile != null && !imageFile.isEmpty()) {
                imgser.saveUser(i, imageFile.getBytes());
            }
            return "redirect:/For-Buy";
        }

        @GetMapping("/For-Buy")
        public String for_Buy(Model model) {
            List <Img> users = imgser.viewdetails();
            model.addAttribute("user", users);
            return "for-buy";
        }
}   