public class PowerOfNumberCalculator {
    public static void main(String[] args) {
        PowerOfNumberCalculator calculator = new PowerOfNumberCalculator();
        int result = calculator.calculatePower(2, 5);
        System.out.println(result);
    }

    public int calculatePower(int base, int exponent) {
        if (exponent < 0){
            return -1;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }
}
