package junit5.tdd;

public class FizzBuzz {
    public static String getFizzBuzzResult(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        if (number % 7 == 0) {
            return "whizz";
        }
        return String.valueOf(number);
    }

}
