package com.test.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	@Bean
	public World mars() {
		return new World();
	}
}
