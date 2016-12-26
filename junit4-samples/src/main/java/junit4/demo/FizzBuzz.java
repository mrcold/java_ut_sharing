package junit4.demo;

public class FizzBuzz
{
    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }

    public String emptyMethod() {
        return "Nothing here";
    }
}
