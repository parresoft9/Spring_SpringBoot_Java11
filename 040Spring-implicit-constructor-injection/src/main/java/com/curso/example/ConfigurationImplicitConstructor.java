package com.curso.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.curso.example.service.OrderService;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan({ "com.curso.example.service", "com.curso.example.client", "com.curso.example.dao" })
public class ConfigurationImplicitConstructor {

	private final OrderService orderService;

	public ConfigurationImplicitConstructor(OrderService orderService) {
		this.orderService = orderService;
	}

	@Bean(name = "services")
	public List<OrderService> services() {
		return Arrays.asList(orderService);
	}

	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationImplicitConstructor.class);
		Object services = context.getBean("services");
		System.out.println(services);
	}

}