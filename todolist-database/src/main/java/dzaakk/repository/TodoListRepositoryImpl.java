package dzaakk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import dzaakk.entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {

    public Todolist[] data = new Todolist[10];

    private DataSource dataSource;

    public TodoListRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull() {
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length + 10];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
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
