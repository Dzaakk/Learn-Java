package dzaakk.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

import dzaakk.entity.Todolist;
import dzaakk.util.DatabaseUtil;

public class TodolistRepositoryImplTest {
    private HikariDataSource dataSource;

    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        Todolist todolist = new Todolist();
        todolist.setTodo("Todo1");

        todoListRepository.add(todolist);
    }

    @Test
    void testRemove() {
        System.out.println(todoListRepository.remove(1));
        System.out.println(todoListRepository.remove(2));
    }

    @Test
    void testGetAll() {
        todoListRepository.add(new Todolist("todo1"));
        todoListRepository.add(new Todolist("todo2"));
        todoListRepository.add(new Todolist("todo3"));
        Todolist[] todolists = todoListRepository.getAll();
        for (var todo : todolists) {
            System.out.println(todo.getId() + " : " + todo.getTodo());
        }
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
