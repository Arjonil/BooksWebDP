package pe.edu.upao.books.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upao.books.models.Book;

import java.util.*;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b, AVG(r.rating) FROM Book b LEFT JOIN b.reviews r GROUP BY b.id")
            List<Object[]> findBooksWithAvgRating();
}

/*
public void save(Book book) {
        //TODO:Aquí va a guardar en la Base de Datos



    }

 */