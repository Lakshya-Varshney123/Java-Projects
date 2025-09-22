import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double total;
        char currency = '$';
        System.out.print("What item would you like to buy?: ");
        String item = in.nextLine();
        System.out.print("What is the price for each?: ");
        double price = in.nextDouble();
        System.out.print("How many would you buy?: ");
        int quantity = in.nextInt();
        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);        
    }
}
