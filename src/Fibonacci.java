public class Fibonacci {
    public static int calculateFibonacci(int n) {
        if (n < 0) return -1;
        if (n==1 || n==2) return 1;

        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for (int i=3; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];

    }
    public static void main(String[] args) {
        int n = 6;
        int result = calculateFibonacci(n);
        System.out.println("Fibonacci of " + n + " is " + result);
    }
}
