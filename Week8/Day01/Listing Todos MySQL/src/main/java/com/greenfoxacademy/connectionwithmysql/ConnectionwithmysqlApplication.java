package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication {

    TodoRepository todoRepository;

    @Autowired
    public ConnectionwithmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionwithmysqlApplication.class, args);
    }


    public void run(String...args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn DI"));
        todoRepository.save(new Todo("I have to practice SQL."));
        todoRepository.save(new Todo("I have to learn HTML & CSS"));
    }

}
