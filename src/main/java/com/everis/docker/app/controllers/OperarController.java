package com.everis.docker.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OperarController {
  
  @Autowired
  private ApplicationProperties properties;
  
  Logger log = LoggerFactory.getLogger(OperarController.class);

	@GetMapping("/sumar/{number1}/{number2}")
	public String sumar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
	  log.info("Sumar: {} + {}", number1, number2);
		model.addAttribute("title", properties.getApplicationName().concat(" Sumar"));
		model.addAttribute("result", number1 + number2);
		return "result";
	}
	
	@GetMapping("/restar/{number1}/{number2}")
	public String restar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
	  log.info("Restar: {} - {}", number1, number2);
	  model.addAttribute("title", properties.getApplicationName().concat(" Restar"));
		model.addAttribute("result", number1 - number2);
		return "result";
	}
	
	@GetMapping("/multiplicar/{number1}/{number2}")
	public String multiplicar(@PathVariable Double number1, @PathVariable Double number2, Model model) {
	  log.info("Multiplicar: {} * {}", number1, number2);
	  model.addAttribute("title", properties.getApplicationName().concat(" Multiplicar"));
		model.addAttribute("result", number1 * number2);
		return "result";
	}
	
	@GetMapping("/dividir/{number1}/{number2}")
	public String dividir(@PathVariable Double number1, @PathVariable Double number2, Model model) {
	  log.info("Dividir: {} / {}", number1, number2);
	  if (number2 == 0) {
	    log.error("Multiplicar: El divisor no puede ser cero.");
	  }
	  model.addAttribute("title", properties.getApplicationName().concat(" Dividir"));
		model.addAttribute("result", number1 / number2);
		return "result";
	}
	
}
