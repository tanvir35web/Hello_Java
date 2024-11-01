public class findMax {
    public static void main(String[] args) {
        int[] numbers = {2,9,0,8,99,-8,1};

        int max = numbers[0];

        for(int i = 1; i <numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}

//complexity: O(n)
