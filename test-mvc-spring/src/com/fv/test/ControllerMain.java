package com.fv.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMain {
	
	@RequestMapping("/")
	public String getMain() {
		return "main-page";
	}
	
	@RequestMapping("/form")
	public String getForm() {
		return "form-page";
	}
	
	@RequestMapping("/formProcessed")
	public String getProcessedForm(HttpServletRequest request, Model model) {
		String input = request.getParameter("userName");
		String result = input.toUpperCase();
		model.addAttribute("inputUppercase", result);
		return "processed-form-page";
	}
	

}
