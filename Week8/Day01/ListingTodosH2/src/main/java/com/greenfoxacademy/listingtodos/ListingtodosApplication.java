package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  private TodoRepository todoRepository;

  @Autowired
  public ListingtodosApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void run(String...args) throws Exception {
    todoRepository.save(new Todo("I have to learn coding in Java"));
    todoRepository.save(new Todo("Learn how to use CSS"));
    todoRepository.save(new Todo("Learning HTML"));
  }
}
