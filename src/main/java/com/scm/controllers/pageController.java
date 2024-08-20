package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pageController {
    
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("This is home page");
        model.addAttribute("title", "Home- Smart Contact Manager");
        model.addAttribute("youtubeChannel", "my  Smart Contact Manager system");
        model.addAttribute("github", "https://github.com/sin-07");
        return "home";
        
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isActive", false);
        System.out.println("This is about page");
        return "about";
    }


    @RequestMapping("/services")
    public String servicesPage(Model model){
        model.addAttribute("isActive", true);
        System.out.println("This is about page");
        return "services";
    }
}
