package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("SPRING_APPLICATION_NAME", dotenv.get("SPRING_APPLICATION_NAME"));
		System.setProperty("SPRING_CLOUD_CONSUL_HOST", dotenv.get("SPRING_CLOUD_CONSUL_HOST"));
		System.setProperty("SPRING_CLOUD_CONSUL_PORT", dotenv.get("SPRING_CLOUD_CONSUL_PORT"));
		System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT"));
		System.setProperty("STUDENT_SERVICE_NAME", dotenv.get("STUDENT_SERVICE_NAME"));
		System.setProperty("SCHOOL_SERVICE_NAME", dotenv.get("SCHOOL_SERVICE_NAME"));


		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
