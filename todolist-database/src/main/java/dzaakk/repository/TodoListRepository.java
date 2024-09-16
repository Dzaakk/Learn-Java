package dzaakk.repository;

import dzaakk.entity.Todolist;

public interface TodoListRepository {

    Todolist[] getAll();

    void add(Todolist todolist);

    boolean remove(Integer number);
}
