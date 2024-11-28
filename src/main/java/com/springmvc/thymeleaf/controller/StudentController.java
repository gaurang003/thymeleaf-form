package com.springmvc.thymeleaf.controller;

import com.springmvc.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${systems}")
    private List<String> systems;

    @Value("${languages}")
    private List<String> languages;


    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel){

        //create student object
        Student theStudent = new Student();

        // add student object to model
        theModel.addAttribute("student", theStudent);

        //add countries to the model
        theModel.addAttribute("countries",countries);

        // add languages to the model
        theModel.addAttribute("languages",languages);

        // add systems to the model
        theModel.addAttribute("systems",systems);

        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent ){

        System.out.println("theStudent: "+ theStudent.getFirstName()+" "+ theStudent.getLastName());
        return "student-confirmation";
    }

}
