public class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        int result = calculator.calculatePower(2, 5);
        System.out.println(result);
    }

    public int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponents are not supported for integer results.");
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent % 2 == 0) { // Exponentiation by squaring
            int halfPower = calculatePower(base, exponent / 2);
            return halfPower * halfPower;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
