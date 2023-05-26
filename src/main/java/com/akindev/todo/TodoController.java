package com.akindev.todo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private List<Todo> todos = new ArrayList();

    @GetMapping("/")
    public List<Todo> getTodos(){
        return todos;
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todos.stream().filter(todo -> id == todo.getId()).findFirst().orElse(null);
    }

    @PostMapping("/todo")
    public void createTodo(){}

    @PatchMapping("/{id}")
    public Todo updateTodoById(@PathVariable int id){
        return todos.get(0);
    }

    @DeleteMapping("/{id}")
    public String deleteTodoById(@PathVariable int id){
        int index = todos.stream().filter(todo -> todo.getId() ==id).findFirst().orElse(null).getId();

        return "deleted";
    }

}

enum TodoStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED
}