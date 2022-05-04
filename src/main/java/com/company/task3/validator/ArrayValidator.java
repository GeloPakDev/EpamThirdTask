package com.company.task3.validator;

import java.util.regex.Pattern;

public class ArrayValidator {
    public static final String REGEX_POSITIVE_INT = "\\p{Digit}";

    public boolean checkNumberCorrectness(String number) {
        return Pattern.matches(REGEX_POSITIVE_INT, number);
    }
}
