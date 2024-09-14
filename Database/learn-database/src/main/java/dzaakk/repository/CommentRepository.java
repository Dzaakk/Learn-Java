package dzaakk.repository;

import java.util.List;

import dzaakk.entity.Comment;

public interface CommentRepository {
    void insert(Comment comment);

    Comment findbyId(Integer id);

    List<Comment> findAll();

    List<Comment> findAllByEmail(String email);
}
