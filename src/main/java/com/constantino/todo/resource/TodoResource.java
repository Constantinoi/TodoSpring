package com.constantino.todo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constantino.todo.domain.Todo;
import com.constantino.todo.services.TodoService;

@RestController
@RequestMapping(value = "/todo")
public class TodoResource {

	@Autowired
	private TodoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Long id) {
		Todo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/open")
	public ResponseEntity<List<Todo>> findOpen() {

		List<Todo> lista = service.findAllOpen();

		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/close")
	public ResponseEntity<List<Todo>> findClose() {

		List<Todo> lista = service.findAllClose();

		return ResponseEntity.ok().body(lista);
	}
}
