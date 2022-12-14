package io.sadeq.springdatajpajavatemplate.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BookRepoTest {

    private final BookRepo bookRepo;

    @Autowired
    BookRepoTest(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Test
    void test() {
        bookRepo.getReferenceById(1L);
    }
}