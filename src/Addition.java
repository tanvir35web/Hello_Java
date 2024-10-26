import java.util.Scanner;

public class Addition {

    //defining the variable of class
    int num1;
    int num2;
    int sum;

    // defining the methods of class
    public void add(){
        sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }

    //main method
    public static void main(String[] args){

        //creating the scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        //creating the object of class
        Addition obj = new Addition();

        // prompting the user to enter values for num1 and num2
        System.out.print("Enter the first number: ");
        obj.num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        obj.num2 = scanner.nextInt();

        //calling the methods
        obj.add();

        //closing the scanner
        scanner.close();
    }
}
