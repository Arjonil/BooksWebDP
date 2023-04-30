package pe.edu.upao.books.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.upao.books.models.Book;
import pe.edu.upao.books.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    public final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestParam String title,
                                        @RequestParam String author,
                                        @RequestParam String description,
                                        @RequestParam(required = false) MultipartFile image){

        Book bX = new Book(title, author, description, null);
        Book newBook = bookService.addBook(bX);
        return ResponseEntity.ok(newBook);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Book> actBook(@RequestBody Book book, @PathVariable Long id){
        Book findBook = bookService.updateBook(id, book);
        return ResponseEntity.ok(findBook);
    }
}
