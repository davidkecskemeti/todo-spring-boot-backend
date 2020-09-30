package com.davidk.rest.webservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<Todo>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "DavidK", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idCounter, "DavidK", "Learn about Microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "DavidK", "Learn about Angular", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == -1 || todo.getId() == 0) {
            todo.setId((long) ++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo == null) return null;
        if (todos.remove(todo)) return todo;
        return null;
    }

    public Todo findById(long id) {
        return todos.stream().filter(todo -> todo.getId() == id)
                .findFirst().orElse(null);
    }
}
