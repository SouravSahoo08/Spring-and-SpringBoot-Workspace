package com.souravsahoo.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentSection")
public class StudentController {

	/**
	 * Shows the student form menu
	 * 
	 * @param model
	 * @return student-form.jsp
	 */
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	/**
	 * Binds the form data with {@link Student} object
	 * 
	 * @param student
	 * @return student-confirmation.jsp
	 */
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
