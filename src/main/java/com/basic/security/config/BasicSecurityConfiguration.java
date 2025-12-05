package com.basic.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurityConfiguration {

	@Bean
	public SecurityFilterChain filter(HttpSecurity http) {
		http.authorizeHttpRequests(auth-> auth.requestMatchers("/greet").authenticated());
		http.formLogin(form-> form.defaultSuccessUrl("/greet", true));
		return http.build();
		
	}
}
