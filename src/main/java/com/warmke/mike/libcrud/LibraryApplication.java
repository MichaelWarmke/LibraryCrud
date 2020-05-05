package com.warmke.mike.libcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.warmke.mike.libcrud.repository")
public class LibraryApplication {

    public static void main(String... args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

}