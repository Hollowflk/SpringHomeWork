package com.Neostudy.SpringHomeWork.Service;

import com.Neostudy.SpringHomeWork.Entities.Author;
import com.Neostudy.SpringHomeWork.Entities.Book;
import com.Neostudy.SpringHomeWork.Repository.AuthorRepository;
import com.Neostudy.SpringHomeWork.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public List<Author> getAuthors(Integer id){
        Book book = bookRepository.findById(id).orElseThrow();
        return book.getAuthors();
    }
}
