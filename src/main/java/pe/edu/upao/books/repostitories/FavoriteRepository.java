package pe.edu.upao.books.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.models.FavoriteBook;
import pe.edu.upao.books.models.Review;
import pe.edu.upao.books.models.User;

import java.util.*;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteBook, Long> {
    List<FavoriteBook> findAllByUser(User user);
}
