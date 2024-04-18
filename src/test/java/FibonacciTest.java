import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void getFibonacciNumberWhenIntOneReturnIntZero() {
        // GIVEN
        int index = 1;
        int expected = 0;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciNumberWhenIntTwoReturnIntOne() {
        // GIVEN
        int index = 2;
        int expected = 1;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciNumberWhenIntThreeReturnIntOne() {
        // GIVEN
        int index = 3;
        int expected = 1;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciNumberWhenIntFourReturnIntTwo() {
        // GIVEN
        int index = 4;
        int expected = 2;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciNumberWhenIntFiveReturnIntThree() {
        // GIVEN
        int index = 5;
        int expected = 3;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciNumberWhenIntTwelveReturnIntEightynine() {
        // GIVEN
        int index = 12;
        int expected = 89;

        // WHEN
        int actual = Fibonacci.getFibonacciNumber(index);

        // THEN
        assertEquals(expected, actual);
    }
}
