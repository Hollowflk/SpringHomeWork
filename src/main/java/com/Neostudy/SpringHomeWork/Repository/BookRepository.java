package com.Neostudy.SpringHomeWork.Repository;

import com.Neostudy.SpringHomeWork.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
