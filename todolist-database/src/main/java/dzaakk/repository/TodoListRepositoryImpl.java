package dzaakk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import dzaakk.entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {

    private DataSource dataSource;

    public TodoListRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Todolist[] getAll() {
        String sql = "SELECT id, todo FROM todolist";
        try (Connection connection = dataSource.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery(sql)) {

            List<Todolist> list = new ArrayList<>();
            while (resultset.next()) {
                Todolist todolist = new Todolist();
                todolist.setId(resultset.getInt("id"));
                todolist.setTodo(resultset.getString("todo"));

                list.add(todolist);
            }

            return list.toArray(new Todolist[] {});
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void add(Todolist todolist) {
        String sql = "INSERT INTO todolist(todo) VALUES(?)";
        try (Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, todolist.getTodo());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isExist(Integer number) {
        String sql = "SELECT id FROM todolist where id = ?";
        try (Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, number);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean remove(Integer number) {
        String sql = "DELETE FROM todolist WHERE id = ?";
        if (isExist(number)) {
            try (Connection connection = dataSource.getConnection();
                    PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, number);
                statement.executeUpdate();
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            return false;
        }

    }
}
