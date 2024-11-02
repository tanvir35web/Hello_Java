class DigitSumCalculator {

    public static void main(String[] args) {
        DigitSumCalculator calculator = new DigitSumCalculator();
        int result = calculator.calculateSumOfDigits(819);
        System.out.println(result);
    }

    public int calculateSumOfDigits(int n) {
        if (n < 0) n = -n;  // Convert negative to positive to handle all integers
        if (n == 0) return 0;
        return n % 10 + calculateSumOfDigits(n / 10);
    }
}
