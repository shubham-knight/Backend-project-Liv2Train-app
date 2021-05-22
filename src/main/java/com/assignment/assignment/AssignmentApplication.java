package com.assignment.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.assignment.assignment.models.SpringSecurityAuditorAware;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AssignmentApplication {

	@Bean
	public	AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	
}
