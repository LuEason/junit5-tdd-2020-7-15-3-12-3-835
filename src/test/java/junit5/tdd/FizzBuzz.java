package junit5.tdd;

public class FizzBuzz {
    public static String getFizzBuzzResult(int number) {
        if (number % 105 == 0) {
            return "FizzBuzzWhizz";
        }
        if (number % 35 == 0) {
            return "BuzzWhizz";
        }
        if (number % 21 == 0) {
            return "FizzWhizz";
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(number);
    }

}
