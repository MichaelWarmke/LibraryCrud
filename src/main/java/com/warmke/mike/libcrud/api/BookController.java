package com.warmke.mike.libcrud.api;

import com.warmke.mike.libcrud.domain.Book;
import com.warmke.mike.libcrud.repository.BookRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("book/")
public class BookController {

    @NonNull
    private BookRepository bookRepo;

    @NonNull
    private InputValidator inputValidator;

    @PostMapping(value = "addBook")
    public @ResponseBody String addBook(@RequestParam String title, @RequestParam String author) {
        Book book = Book.builder().author(author).title(title).build();
        bookRepo.save(book);
        return "Success!";
    }
}
