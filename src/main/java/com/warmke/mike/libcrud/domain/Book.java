package com.warmke.mike.libcrud.domain;

import lombok.Value;

import java.util.Date;

@Value
public class Book {

    Long id;
    String title;
    String author;
    Date publishDate;
}
