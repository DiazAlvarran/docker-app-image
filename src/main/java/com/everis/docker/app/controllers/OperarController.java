package com.everis.docker.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OperarController {

	@GetMapping("/sumar/{number1}/{number2}")
	public String sumar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
		model.addAttribute("title", "Sumar");
		model.addAttribute("result", number1 + number2);
		return "result";
	}
	
	@GetMapping("/restar/{number1}/{number2}")
	public String restar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
		model.addAttribute("title", "Restar");
		model.addAttribute("result", number1 - number2);
		return "result";
	}
	
	@GetMapping("/multiplicar/{number1}/{number2}")
	public String multiplicar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
		model.addAttribute("title", "Multiplicar");
		model.addAttribute("result", number1 * number2);
		return "result";
	}
	
	@GetMapping("/dividir/{number1}/{number2}")
	public String dividir(@PathVariable Double number1, @PathVariable Double number2, Model model) {
		model.addAttribute("title", "Dividir");
		model.addAttribute("result", number1 / number2);
		return "result";
	}
	
}
