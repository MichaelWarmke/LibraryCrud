package com.warmke.mike.libcrud;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class AppProperties {

    @Value("username.regex")
    private String userRegex;

    @Value("password.regex")
    private String passRegex;


}
