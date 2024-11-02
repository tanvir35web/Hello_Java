public class GCDCalculator {
    public static void main(String[] args) {
        GCDCalculator calculator = new GCDCalculator();
        int result = calculator.calculateGCD(48, 18);
        System.out.println("GCD: " + result);
    }

    public int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
