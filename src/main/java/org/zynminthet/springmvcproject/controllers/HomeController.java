package org.zynminthet.springmvcproject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



    @RequestMapping("/show-form")
    public String showForm(){
        return "login";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return  "welcome";
    }

    @RequestMapping("/")
    public String homePage() {
        return "home";
    }






}
