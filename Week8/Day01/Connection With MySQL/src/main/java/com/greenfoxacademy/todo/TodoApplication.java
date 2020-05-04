package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.repositories.TodoRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  private TodoRepository repository;

  public TodoApplication(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... args) {
    repository.save(new Todo("css"));
    repository.save(new Todo("html"));
    repository.save(new Todo("java"));
  }
}
