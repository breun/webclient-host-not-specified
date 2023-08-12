package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var client = WebClient.builder().build();
		client.get().uri("localhost:1337").retrieve().bodyToMono(String.class).block();
	}
}
