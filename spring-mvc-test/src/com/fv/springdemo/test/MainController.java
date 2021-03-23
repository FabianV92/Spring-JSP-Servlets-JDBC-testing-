package com.fv.springdemo.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getIndexPage() {
		return "main-page";
	}
	
	@RequestMapping("/form")
	public String getFormPage() {
		return "form-page";
	}
	
	@RequestMapping("/processedForm") 
	public String getProcessedPage(HttpServletRequest request, Model model) {
		String input = request.getParameter("userName");
		String result = input.toUpperCase();
		model.addAttribute("message",result);
		return "processed-form";
	}
	
}
