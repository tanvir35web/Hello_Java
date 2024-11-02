class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacciCalculator = new Fibonacci();
        var result = fibonacciCalculator.calculateFibonacci(4);
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
