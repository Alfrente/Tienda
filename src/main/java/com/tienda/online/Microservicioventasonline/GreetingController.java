package com.tienda.online.Microservicioventasonline;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();
	private static final String TEMPLATE = "Hola %s";
	
	@GetMapping
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.getAndIncrement(), String.format(TEMPLATE, name));
	}
}
