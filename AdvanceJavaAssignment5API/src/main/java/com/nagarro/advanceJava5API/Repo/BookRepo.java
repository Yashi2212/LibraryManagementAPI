package com.nagarro.advanceJava5API.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.advanceJava5API.model.Author;
import com.nagarro.advanceJava5API.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, String> {
	List<Book> findByAuthor(Author author);
}
