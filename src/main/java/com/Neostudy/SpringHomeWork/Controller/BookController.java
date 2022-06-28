package com.Neostudy.SpringHomeWork.Controller;

import com.Neostudy.SpringHomeWork.Entities.Author;
import com.Neostudy.SpringHomeWork.Entities.Book;
import com.Neostudy.SpringHomeWork.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public List<Author> getAuthor(@PathVariable Integer id){
        return bookService.getAuthors(id);
    }

    @GetMapping("/price/{id}")
    public Integer priceBooks(@PathVariable Integer id){
        return bookService.priceBooks(id);
    }

}
