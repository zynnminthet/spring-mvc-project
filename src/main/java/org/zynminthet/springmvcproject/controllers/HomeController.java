package org.zynminthet.springmvcproject.controllers;


import com.sun.net.httpserver.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zynminthet.springmvcproject.beans.Student;

import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {

    @Value("#{countryProperties}")
    private Map<String, String> countryProperties;

    @RequestMapping("/")
    public void loginPageDamnIt(HttpServletResponse response) throws IOException {
        response.sendRedirect("login");
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countryOptions", countryProperties);
        return "login";
    }

    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student")Student student) {
        return "welcome";
    }

    @RequestMapping("/sort")
    public String sort(Model model) {
        return "welcome";
    }
}
