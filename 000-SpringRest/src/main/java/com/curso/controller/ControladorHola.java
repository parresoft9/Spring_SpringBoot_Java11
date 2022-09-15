package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.service.HolaService;

@RestController
public class ControladorHola {
	@Autowired
	HolaService servicio;

	@GetMapping("/hola")
	public String hola() {

		return servicio.hola();
	}

	@RequestMapping("/hola2")
	public String hola2() {

		return servicio.hola2();
	}

	@RequestMapping("/holas")
	public String holas() {

		long t1 = System.currentTimeMillis();
		String texto = servicio.hola() + " - " + servicio.hola2();
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo transcurrido en ms: "+(t2 - t1));
		return texto;
	}
}
