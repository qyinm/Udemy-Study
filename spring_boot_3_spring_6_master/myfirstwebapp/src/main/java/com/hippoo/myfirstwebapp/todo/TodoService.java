package com.hippoo.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "teacher1", "learn aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "teacher1", "learn full stack development", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "teacher1", "learn devops", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos.stream().filter(todo -> todo.getUsername().equals(username)).toList();
    }
}
