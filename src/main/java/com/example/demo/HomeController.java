    package com.example.demo;

    //import class (class is the Controller, etc.)
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    //class
    public class HomeController {

//        @RequestMapping("/")
//        //parameter or controller method
//        public String homePage(Model model){
//            model.addAttribute("myvar", "Say hello to the people.");
//            return "hometemplate";
//        }

        @RequestMapping("/")
        //method and can be called anything
        public String myGreetings(Model model){
            model.addAttribute("myvar", "hello, again");
            model.addAttribute("myvar2", "i'm back!");
            return "secondhometemplate";
        }
//
//        @RequestMapping ("/")
//        public String myComeback(Model model){
//            model.addAttribute("myvar", "i'm back!");
//            return "secondhometemplate";
//        }
    }
