package com.greenfoxacademy.todo.repositories;

import com.sun.tools.javac.comp.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
