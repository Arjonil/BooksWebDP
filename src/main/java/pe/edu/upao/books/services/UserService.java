package pe.edu.upao.books.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.books.models.User;
import pe.edu.upao.books.repostitories.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
    User getuserByUsername(String username);

    User addUser(User user);

    User updateUser(Long id, User user);
    void deleteUser(Long id);

    User register(String username, String password, String email);

    User login(String username, String password);
}

