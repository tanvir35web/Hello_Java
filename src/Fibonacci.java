import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int F1 = 1, F2 = 1, Fi = 1;

        for (int i = 3; i <= n; i++) {
            Fi = F1 + F2;  // Calculate the next Fibonacci number
            F1 = F2;       // Shift the values
            F2 = Fi;
        }

        return Fi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

        scanner.close();
    }
}
