package ru.petrovvich.book.service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.petrovvich.book.service.dto.BookDto;
import ru.petrovvich.book.service.service.BooksService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BooksController {
    private final BooksService booksService;

    @GetMapping("/books")
    public Flux<BookDto> findAll() {
        return booksService.findAll();
    }
}
