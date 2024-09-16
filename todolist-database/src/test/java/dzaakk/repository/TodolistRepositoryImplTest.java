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

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
