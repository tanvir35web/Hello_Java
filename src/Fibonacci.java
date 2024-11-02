class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        var result = fibonacci.fibonacci(4);
        System.out.println(result);
    }

    public int fibonacci(int n) {
        if (n < 0) return -1;
        if (n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}