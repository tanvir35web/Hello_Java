class Factorial {
    public static void main(String[] args){
        Factorial recursion = new Factorial();
        var result = recursion.factorial(7);
        System.out.println(result);
    }

    public int factorial(int n){
        if (n < 0) return -1;
        if (n==0 || n==1){
            return 1;
        }
    return n * factorial(n-1);
    };
}
