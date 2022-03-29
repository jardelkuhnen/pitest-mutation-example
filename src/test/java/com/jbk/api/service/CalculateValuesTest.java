package com.jbk.api.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class CalculateValuesTest {

    private CalculateValues calculateValues;

    @BeforeEach
    void setUp() {
        calculateValues = new CalculateValues();
    }

    @Test
    public void countLettersOfWord() {
        assertEquals(6, calculateValues.countLettersOfWord("Jardel"));
    }

    @Test
    public void shouldReturnExceptionCountLettersOfWord() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            calculateValues.countLettersOfWord(null);
        });
    }

    @Test
    public void shouldReturnExceptionWithEmptyCountLettersOfWord() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            calculateValues.countLettersOfWord(StringUtils.EMPTY);
        });
    }

    @Test
    public void sumValues() {
        int result = calculateValues.sumValues(10, 2);
        assertEquals(12, result);
    }

    @Test
    public void shouldReturnisPar() {
        assertTrue(calculateValues.isPar(10));
    }

    @Test
    public void shouldNotReturnisPar() {
        assertFalse(calculateValues.isPar(5));
    }
}
