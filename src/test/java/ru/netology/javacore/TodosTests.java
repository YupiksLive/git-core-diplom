package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TodosTests {
    @Test
    public void testTodosAdd() {
        Todos todos = new Todos();
        todos.addTask("Погулять");
        Assertions.assertEquals(todos.getAllTasks(), "Погулять ");
    }

    @Test
    public void testTodosRemove() {
        Todos todos = new Todos();
        todos.addTask("Погулять");
        todos.removeTask("Погулять");
        Assertions.assertEquals(todos.getAllTasks(), "");
    }

    @Test
    public void testTodosGetAll() {
        Todos todos = new Todos();
        todos.addTask("Погулять");
        todos.addTask("Убраться");
        Assertions.assertEquals(todos.getAllTasks(), "Погулять Убраться ");
    }
}
