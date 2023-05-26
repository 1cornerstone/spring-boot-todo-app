package com.akindev.todo;



public class Todo{
   private int id;
   private String text;
   private TodoStatus status;
    public Todo(int id, String text, TodoStatus status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public TodoStatus getStatus() {
        return status;
    }
}

