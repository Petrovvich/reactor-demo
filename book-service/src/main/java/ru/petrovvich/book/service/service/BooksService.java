package ru.petrovvich.book.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.reactive.TransactionalOperator;
import reactor.core.publisher.Flux;
import ru.petrovvich.book.service.dto.BookDto;
import ru.petrovvich.book.service.mappers.BookMapper;
import ru.petrovvich.book.service.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BookRepository bookRepository;
    private final TransactionalOperator transactionalOperator;

    public Flux<BookDto> findAll() {
        return transactionalOperator.transactional(
                bookRepository
                        .findAll()
                        .map(BookMapper.INSTANCE::map)
        );
    }
}
