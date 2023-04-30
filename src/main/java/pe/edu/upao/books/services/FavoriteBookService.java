package pe.edu.upao.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.models.FavoriteBook;
import pe.edu.upao.books.models.User;
import pe.edu.upao.books.repostitories.FavoriteRepository;

import java.util.List;

@Service
public interface FavoriteBookService {
    FavoriteBook saveFavorite(FavoriteBook favorite);

    void deleteFavoriteById(Long id);

    List<FavoriteBook> getAllFavoritesByUser(User user);

    FavoriteBook addFavoriteBook(Long bookId, Long userId);
    List<Book> getFavoriteBooksByUserId(Long userId);
    void removeFavoriteBook(Long bookId, Long userId);
}

