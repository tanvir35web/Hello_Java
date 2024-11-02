/**
 * A utility class for calculating the factorial of a number.
 */
class FactorialCalculator {

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(7);
        System.out.println(result);
    }

    /**
     * Calculates the factorial of a non-negative integer n.
     * @param n the number for which to calculate the factorial
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
