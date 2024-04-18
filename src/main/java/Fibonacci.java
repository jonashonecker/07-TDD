public class Fibonacci {
    public static int getFibonacciNumber(int index) {
        int firstNumber = 0;
        int secondNumber = 1;
        int newNumber = 0;

        if (index == 1) {
            return firstNumber;
        } else if (index == 2) {
            return secondNumber;
        } else {
            for (int i = 0; i < index - 2; i++) {
                newNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = newNumber;
            }
        }
        return newNumber;
    }
}
