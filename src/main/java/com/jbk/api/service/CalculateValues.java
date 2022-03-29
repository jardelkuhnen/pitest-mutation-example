package com.jbk.api.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateValues {

    public int countLettersOfWord(String word) {
        if (word == null) {
            throw new RuntimeException("Word cannot be empty!");
        }

        if (word == "") {
            throw new RuntimeException("Word cannot be empty!");
        }

        return word.length();
    }

    public int sumValues(int valueA, int valueB) {
        return valueA + valueB;
    }

    public boolean isPar(int value) {
        return value % 2 == 0;
    }

    public boolean isImpar(int value) {
        return value % 2 > 0;
    }

}
