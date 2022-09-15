package com.curso.service;

import org.springframework.stereotype.Service;

@Service
public class HolaService {
	public String hola() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hola sincrono";
	}

	public String hola2() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "hola sincrono 2";
	}
}