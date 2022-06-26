package com.Neostudy.SpringHomeWork.Service;

import com.Neostudy.SpringHomeWork.Entities.Book;
import com.Neostudy.SpringHomeWork.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public List<Book> findAll(){
        return bookRepository.findAll();
    }

}
