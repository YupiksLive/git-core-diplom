package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    public String type;
    public String task;
    private List<String> todos = new ArrayList<>();
    private StringBuilder stringBuilder = new StringBuilder();

    public void addTask(String task) {
        todos.add(task);
    }

    public void removeTask(String task) {
        todos.remove(task);
    }

    public String getAllTasks() {
        todos.stream()
                .sorted();
        for (String todo : todos ){
            stringBuilder.append(todo + " ");
        }
        String todosAll = stringBuilder.toString();
        return todosAll;
    }

}
