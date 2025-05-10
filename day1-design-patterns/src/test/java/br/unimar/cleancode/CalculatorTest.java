package br.unimar.cleancode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldSumTwoNumber() {
        assertEquals(10, calculator.sum(8, 2));
    }

    @Test
    void shouldSubtractTwoNumber() {
        assertEquals(6, calculator.subtract(8, 2));
    }

    @Test
    void shouldMultiplyTwoNumber() {
        assertEquals(16, calculator.multiply(8, 2));
    }

    @Test
    void shouldDivideTwoNumber() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void shouldThrowADivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0));
    }

    @Test
    void shouldSqrtANumber() {
        assertEquals(4, calculator.sqrt(16));
    }
}