package ru.petrovvich.book.service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

/**
 * Сущность, описываюая представление книги в каталоге
 */
@Data
@Builder
@Table(value = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private Long id;
    @NonNull
    @Column
    private String name;
    @NonNull
    @Column("release_date")
    private Instant releaseDate;
    @NonNull
    @Column
    private String isbn;
    @NonNull
    @Column
    private Long edition;
}



