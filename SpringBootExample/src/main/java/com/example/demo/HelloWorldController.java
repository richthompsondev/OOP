package com.example.demo;
// From Udemy's Learn Spring Boot the Easy Way!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // Criar um Map do model object e encontrar uma view
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("From controller...");
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("hello", "Hello");
		mv.addObject("name", name);
		return mv;
	}
}