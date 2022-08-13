package com.constantino.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constantino.todo.domain.Todo;
import com.constantino.todo.repository.TodoRepository;

@Service
public class DbService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formmater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "estudar spring", LocalDateTime.parse("25/03/2022 18:46", formmater),
				false);
		Todo t2 = new Todo(null, "Meditar", "relaxar a mente", LocalDateTime.parse("25/03/2022 19:00", formmater),
				false);
		Todo t3 = new Todo(null, "Ler", "desenvolvimento pessoal", LocalDateTime.parse("25/03/2022 20:00", formmater),
				false);
		Todo t4 = new Todo(null, "Exercitar", "academia", LocalDateTime.parse("25/03/2022 22:00", formmater), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}
}
