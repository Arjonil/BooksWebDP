package pe.edu.upao.books.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.models.Review;
import pe.edu.upao.books.models.User;
import pe.edu.upao.books.repostitories.BookRepository;
import pe.edu.upao.books.repostitories.ReviewRepository;
import pe.edu.upao.books.repostitories.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface ReviewService {
    Review createReview(Review review, Long bookId, Long userId);
    List<Review> getReviewsByBookId(Long bookId);
    Review getReviewByBookIdAndUserId(Long bookId, Long userId);

    List<Review> getAllReviews();

    /*     @Override
             public Review getReviewsByBookId(Long bookId){

             }*/
    Review addReview(Long bookId, Long userId, Review review);

    Review updateReview(Long id, Review review);
    void deleteReview(Long id);
    Review addReview(Long bookId, Long userId, String title, String comment, Integer rating);

    List<Review> getReviewsByUserId();
}

