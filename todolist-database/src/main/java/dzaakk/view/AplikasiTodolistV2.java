package dzaakk.view;

import javax.sql.DataSource;

import dzaakk.repository.TodoListRepository;
import dzaakk.repository.TodoListRepositoryImpl;
import dzaakk.service.TodoListService;
import dzaakk.service.TodoListServiceImpl;
import dzaakk.util.DatabaseUtil;

public class AplikasiTodolistV2 {
    public static void main(String[] args) {
        DataSource dataSource = DatabaseUtil.getDataSource();
        TodoListRepository todoListRepository = new TodoListRepositoryImpl(dataSource);
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
