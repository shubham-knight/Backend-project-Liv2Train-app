package com.assignment.assignment.models;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;


//listens to the updates made and makes timestamps
public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.ofNullable("root").filter(s -> !s.isEmpty());
	}

}
