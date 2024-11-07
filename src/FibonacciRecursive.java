class FibonacciRecursive {
    public static void main(String[] args) {
        FibonacciRecursive fibonacciCalculator = new FibonacciRecursive();
        var result = fibonacciCalculator.calculateFibonacci(5);
        System.out.println(result);
    }

    public int calculateFibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
