package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public Iterable<Todo> getTodosFromDatabase() {
    return todoRepository.findAll();
  }


  public List<Todo> isDone(boolean isDone) {
    List<Todo> list = new ArrayList<>();
    todoRepository.findAll().forEach(list::add);
    if (isDone) {
      return list.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList());
    } else {
      return list.stream().filter(todo -> todo.isDone()).collect(Collectors.toList());
    }
  }

  public void addNewTodo(Todo todo) {
    todoRepository.save(todo);
  }
}
