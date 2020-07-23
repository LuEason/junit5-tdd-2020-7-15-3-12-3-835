package junit5.tdd;

public class FizzBuzz {
    public static String getFizzBuzzResult(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }

}
