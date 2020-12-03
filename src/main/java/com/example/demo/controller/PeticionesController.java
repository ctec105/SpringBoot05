package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PeticionesController {

	// Hay 2 formas de hacer peticiones

	// localhost:8080/peticiones1?nombre=jose
	@GetMapping("/peticiones1")
	public ModelAndView peticiones1(@RequestParam(name = "nombre") String nombre) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", nombre);
		return mav;
	}

	// localhost:8080/peticiones2/jose
	@GetMapping("/peticiones2/{nombre}")
	public ModelAndView peticiones2(@PathVariable(name = "nombre") String nombre) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", nombre);
		return mav;
	}

}
