package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_fizz_buzz_given_1() {
        // given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_fizz_buzz_given_1() {
        // given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("fizz", actual);
    }

    @Test
    void should_return_buzz_when_fizz_buzz_given_5() {
        // given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("buzz", actual);
    }

    @Test
    void should_return_whizz_when_fizz_buzz_given_7() {
        // given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("whizz", actual);
    }

    @Test
    void should_return_fizzbuzz_when_fizz_buzz_given_15() {
        // given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("fizzbuzz", actual);
    }
}
