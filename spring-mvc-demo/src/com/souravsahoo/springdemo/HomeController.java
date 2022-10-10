package com.souravsahoo.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "form-menu-view";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm-view";
	}

	// get data from request using getParameter()
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {

		String name = request.getParameter("inputField");
		name = name.toUpperCase();
		model.addAttribute("message", name);

		return "processForm-view";
	}

	// getting data from request using @RequestParam annotation
	@RequestMapping("/processFormV3")
	public String processFormV2(@RequestParam("inputField") String name, Model model) {

		name = name.toUpperCase();
		model.addAttribute("message", name);

		return "processForm-view";
	}

}
