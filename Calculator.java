import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = in.nextInt();
        System.out.print(" Choose the operator.... +, -, *, /: ");
        String operator = in.next();
        if ( operator.equals("+") ){
            System.out.print(" Sum of numbers is: " + (num1+num2)); 
        }
        else if( operator.equals("-")){
            System.out.println(" Difference of numbers is: " + (num1-num2));
        }
        else if( operator.equals("*")){
            System.out.println(" Multiplication of numbers is: " + (num1*num2));
        }
        else if (operator.equals("/")) {
            System.out.println(" Division of numbers is: " + (num1/num2));
        }
        else {
            System.out.println(" Invalid Operation...");
        }
    }
}