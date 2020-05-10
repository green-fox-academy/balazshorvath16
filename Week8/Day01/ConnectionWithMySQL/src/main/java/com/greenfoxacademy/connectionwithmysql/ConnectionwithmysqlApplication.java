package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  private TodoRepository todoRepository;

  @Autowired
  public ConnectionwithmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void run(String...args) throws Exception {
    todoRepository.save(new Todo("Daily task", false, false));
    todoRepository.save(new Todo("Make the beds", true, true));
    todoRepository.save(new Todo("Do the washing up", true, false));
    todoRepository.save(new Todo("Clean the bathroom and the kitchen", true, false));
    todoRepository.save(new Todo("Wipe all the surfaces with a cloth", true, true));
    todoRepository.save(new Todo("Remove the grease", true, true));
    todoRepository.save(new Todo("Tidy up", false, true));
    todoRepository.save(new Todo("Throw away the rubbish", true, false));
    todoRepository.save(new Todo("Broom", true, false));
    todoRepository.save(new Todo("Sweep the fllor", true, true));
    todoRepository.save(new Todo("Wash the floors", true, false));
    todoRepository.save(new Todo("Mop", true, true));
    todoRepository.save(new Todo("Vacuum the carpet", false, false));
    todoRepository.save(new Todo("Vacuum cleaner/hoover", true, true));
    todoRepository.save(new Todo("Duest the furniture", true, false));
  }
}
