package com.crediya;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(
		title = "CrediYa API",
		version = "1.0.0",
		description = "API for loan management in the CrediYa platform."
))
@SpringBootApplication
public class CrediyaLoanApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrediyaLoanApplication.class, args);
	}
}
