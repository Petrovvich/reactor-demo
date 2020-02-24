package ru.petrovvich.book.service.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.petrovvich.book.service.model.Book;

/**
 * Реактивный репозиторий для работы с сущностью {@link ru.petrovvich.book.service.model.Book}
 */
public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
