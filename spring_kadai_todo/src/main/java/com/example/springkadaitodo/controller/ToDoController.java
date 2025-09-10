package com.example.springkadaitodo.controller;

import org.springframework.stereotype.Controller;

import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
	
	
    }
	
}
