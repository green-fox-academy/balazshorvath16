package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.text.normalizer.NormalizerBase.Mode;

@Controller
public class MainController {

  private TodoRepository todoRepository;
  private TodoService todoService;

  @Autowired
  public MainController(TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoService.getTodosFromDatabase());
    } else {
      model.addAttribute("todos", todoService.isDone(isActive));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addTodo(Model model) {
  model.addAttribute("newTodo", new Todo());
  return "addtodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
  todoService.addNewTodo(todo);
  return "redirect:/list";
  }
}
