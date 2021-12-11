package com.books.doa;
import org.springframework.data.jpa.repository.JpaRepository;
import com.books.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
