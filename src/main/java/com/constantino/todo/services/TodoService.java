package com.constantino.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constantino.todo.domain.Todo;
import com.constantino.todo.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Todo> findAllOpen() {
		return repository.findAllOpen();
	}
}
