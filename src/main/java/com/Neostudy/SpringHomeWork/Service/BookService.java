package com.Neostudy.SpringHomeWork.Service;

import com.Neostudy.SpringHomeWork.Entities.Author;
import com.Neostudy.SpringHomeWork.Entities.Book;
import com.Neostudy.SpringHomeWork.Repository.AuthorRepository;
import com.Neostudy.SpringHomeWork.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    private final AuthorService authorService;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public List<Author> getAuthors(Integer id){
        Book book = bookRepository.findById(id).orElseThrow();
        return book.getAuthors();
    }

    public Integer priceBooks(Integer id){
        Integer sum = 0;
        List<Book> books = authorService.getBooks(id);
        for(Book book : books){
            sum = sum + book.getPrice();
        }
        return sum;
    }
}
