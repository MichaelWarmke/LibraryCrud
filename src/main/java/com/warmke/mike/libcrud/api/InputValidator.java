package com.warmke.mike.libcrud.api;

import com.warmke.mike.libcrud.AppProperties;
import lombok.RequiredArgsConstructor;
import org.owasp.validator.html.AntiSamy;
import org.owasp.validator.html.PolicyException;
import org.owasp.validator.html.ScanException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class InputValidator {

    private final AppProperties appProperties;
    private final AntiSamy validator;
    private Predicate<String> usernamePattern;
    private Predicate<String> passwordPattern;

    @PostConstruct
    public void setup() {
        usernamePattern = Pattern.compile(appProperties.getUserRegex()).asMatchPredicate();
        passwordPattern = Pattern.compile(appProperties.getPassRegex()).asMatchPredicate();
    }

    public String validateHtmlText(String input) throws PolicyException, ScanException {
        return validator.scan(input).getCleanHTML();
    }

    public boolean validateUserName(String input) {
        return usernamePattern.test(input);
    }

    public boolean validatePassword(String input) {
        return passwordPattern.test(input);
    }
}
