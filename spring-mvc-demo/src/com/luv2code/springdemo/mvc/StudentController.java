package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();

		// add student object to the model as a model attribute
		theModel.addAttribute("student", theStudent); // "student" used as name of attribute

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// Logging/ checking the input data
		System.out.println("logged in data: " + theStudent.getFirstName() + " " + theStudent.getLastName());

		return "student-confirmation";
	}

}
