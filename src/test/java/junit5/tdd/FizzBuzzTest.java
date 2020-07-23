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
    void should_return_Fizz_when_fizz_buzz_given_1() {
        // given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_fizz_buzz_given_5() {
        // given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_fizz_buzz_given_7() {
        // given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_fizz_buzz_given_15() {
        // given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_fizz_buzz_given_21() {
        // given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_fizz_buzz_given_35() {
        // given
        int number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_fizz_buzz_given_105() {
        // given
        int number = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.getFizzBuzzResult(number);

        // then
        assertEquals("FizzBuzzWhizz", actual);
    }
}
