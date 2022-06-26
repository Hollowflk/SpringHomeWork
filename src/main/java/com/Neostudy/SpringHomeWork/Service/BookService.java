package com.Neostudy.SpringHomeWork.Service;

import com.Neostudy.SpringHomeWork.Entities.Book;
import com.Neostudy.SpringHomeWork.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
