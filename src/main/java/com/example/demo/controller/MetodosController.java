package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/") // path a nivel de clase
public class MetodosController {

	// método 1
	@GetMapping("/metodo1")
	public String metodo1(Model model) {
		//model.addAttribute("persona", new Persona("José", "3245866"));
		model.addAttribute("personas", getPersonas());
		//return "vista1";
		return "resultados";
	}
	
	//método2
	@GetMapping("/metodo2")
	public ModelAndView metodo2() { 
		//ModelAndView mav = new ModelAndView("vista2"); //la vista
		ModelAndView mav = new ModelAndView("resultados"); //la vista
		//mav.addObject("persona", new Persona("Gabriela", "3258966"));
		mav.addObject("personas", getPersonas());
		return mav;
	}
	
	
	private List<Persona> getPersonas(){
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(new Persona("José", "3245866"));
		personaList.add(new Persona("Gabriela", "3245856"));
		personaList.add(new Persona("Tatiana", "3245866"));
		personaList.add(new Persona("Luis", "328866"));
		return personaList;
	}
}
