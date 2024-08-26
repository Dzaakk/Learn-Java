package Test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();

        todoListRepository.data[0] = new Todolist("Take a break");
        todoListRepository.data[1] = new Todolist("Prepare meal");
        todoListRepository.data[2] = new Todolist("shower");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Take a break");
        todoListService.addTodoList("Prepare meal");
        todoListService.addTodoList("shower");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Take a break");
        todoListService.addTodoList("Prepare meal");
        todoListService.addTodoList("shower");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(1);
        todoListService.showTodoList();

    }
}
