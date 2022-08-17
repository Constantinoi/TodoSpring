package com.constantino.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.constantino.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

	@Query("SELECT todo FROM Todo todo WHERE todo.finalizado = false ORDER BY todo.dataParaFinalizar ")
	List<Todo> findAllOpen();

	@Query("SELECT todo FROM Todo todo WHERE todo.finalizado = true ORDER BY todo.dataParaFinalizar ")
	List<Todo> findAllClose();

}
