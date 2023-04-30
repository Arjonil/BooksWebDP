package pe.edu.upao.books.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.repostitories.BookRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();

    Book addBook(Book book);

    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
    List<Book> searchBooks(String keyword);

}

