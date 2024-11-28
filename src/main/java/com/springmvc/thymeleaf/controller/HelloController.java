package com.springmvc.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


    //need a controller method to show initial Html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String addMethod(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo ! " + theName;

        model.addAttribute("message", result);



        return "helloworld";

    }



    @RequestMapping("/processFormVersionThree")
    public String newMethodToAdd(@RequestParam("studentName")String theName ,Model model){


        theName = theName.toUpperCase();

        String result = "Hey My friend " + theName;

        model.addAttribute("message", result);

        return "helloworld";

    }
}
