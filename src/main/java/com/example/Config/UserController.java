package com.example.Config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
        private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Log/dashboard"; 
    }

    @GetMapping("/login")
    public String login() {
        return "/Log/login"; 
    }

    @GetMapping("/logout")
    public String logout() {
        return "Log/login"; 
    }

    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "/Log/register";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER"); // Default role USER
        userRepository.save(user);
        return "redirect:/login";
    }

}
