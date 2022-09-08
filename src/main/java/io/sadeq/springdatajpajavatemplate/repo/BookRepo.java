package io.sadeq.springdatajpajavatemplate.repo;

import io.sadeq.springdatajpajavatemplate.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
