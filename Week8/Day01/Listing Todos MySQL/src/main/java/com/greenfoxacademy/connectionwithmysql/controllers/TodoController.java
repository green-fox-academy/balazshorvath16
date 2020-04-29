package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository ;
    }

    @GetMapping("/todo")
    public String home(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(value = "isActive", required = false, defaultValue = "false") boolean isActive, Model model) {
        if (isActive) {
            model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String getAddPage(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    public String sbumitNewTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "rediect:/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("todoByID", todoRepository.findById(id).get());
        return "editTodo";
    }

    @PostMapping("/{id}/edit")
    public String updateSubmit(@PathVariable long id, @ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/list";
    }
}

