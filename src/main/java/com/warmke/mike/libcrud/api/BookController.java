package com.warmke.mike.libcrud.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("book/")
public class BookController {

    @PostMapping(value = "addBook")
    public @ResponseBody String postForBook(@RequestParam String title, @RequestParam String author) {

    }
}
