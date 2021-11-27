package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class RestAssg2 {
	public static void main(String[] args) {
		SpringApplication.run(RestAssg2.class, args);
	System.out.println("APP HAS STARTED");
	}
}