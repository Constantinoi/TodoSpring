package com.constantino.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.constantino.todo.services.DbService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DbService dbService;

	@Bean
	public boolean instancia() {

		this.dbService.instanciaBaseDeDados();

		return true;
	}

}
