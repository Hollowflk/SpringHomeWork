package com.Neostudy.SpringHomeWork.Repository;

import com.Neostudy.SpringHomeWork.Entities.Author;
import com.Neostudy.SpringHomeWork.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
