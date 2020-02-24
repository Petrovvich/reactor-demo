package ru.petrovvich.book.service.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.petrovvich.book.service.dto.BookDto;
import ru.petrovvich.book.service.model.Book;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto map(Book source);
}
