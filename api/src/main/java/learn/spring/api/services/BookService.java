package learn.spring.api.services;

import learn.spring.api.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
