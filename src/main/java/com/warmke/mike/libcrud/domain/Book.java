package com.warmke.mike.libcrud.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class Book {

    Long id;
    String title;
    String author;
    Date publishDate;
}
