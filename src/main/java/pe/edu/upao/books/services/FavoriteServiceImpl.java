package pe.edu.upao.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.models.FavoriteBook;
import pe.edu.upao.books.models.User;
import pe.edu.upao.books.repostitories.FavoriteRepository;

import java.util.*;

@Service
public class FavoriteServiceImpl implements FavoriteBookService{

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public FavoriteBook saveFavorite(FavoriteBook favorite){
        return favoriteRepository.save(favorite);
    }

    @Override
    public void deleteFavoriteById(Long id){
        favoriteRepository.deleteById(id);
    }

    @Override
    public List<FavoriteBook> getAllFavoritesByUser(User user){
        return favoriteRepository.findAllByUser(user);
    }

    @Override
    public FavoriteBook addFavoriteBook(Long bookId, Long userId) {
        return null;
    }

    @Override
    public List<Book> getFavoriteBooksByUserId(Long userId) {
        return null;
    }

    @Override
    public void removeFavoriteBook(Long bookId, Long userId) {

    }
}