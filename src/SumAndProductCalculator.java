public class SumAndProductCalculator {
    public static void main(String[] args) {
        SumAndProductCalculator calculator = new SumAndProductCalculator();

        int[] arr = {1, 3, 4, 5};
        calculator.calculateSumaAndProduct(arr);
    }

    public void calculateSumaAndProduct(int[] numbers ) {
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        ;
        System.out.println(sum + ", " + product);
    };
}
