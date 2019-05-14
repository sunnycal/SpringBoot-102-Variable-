package com.example.demo;

//import class (class is the Controller, etc.)
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//class
public class HomeController {

    @RequestMapping("/")
    //parameter
    public String homePage(Model model){
        model.addAttribute("myvar", "Say hello to the people.");
        return "hometemplate";
    }
}
