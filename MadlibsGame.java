import java.util.Scanner;
public class MadlibsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" LET'S PLAY A FUN GAME.... ");
        System.out.print(" Enter your name: ");
        String name = in.nextLine();
        System.out.print(" Enter the place: ");
        String place = in.nextLine();
        System.out.print(" Enter the adjective: ");
        String adjective = in.nextLine();
        System.out.print(" Enter the noun: ");
        String noun = in.nextLine();
        System.out.println(" YOUR MADLIBS GAME IS.... ");
        System.out.println("One day," + " " + name +" " + "went to" + " " + place + ".It was a very" + " " + adjective + "day." + "Suddenly," + name + " " + "found a" + " " + noun + " " + "and laughed loudly!");
        in.close();

    }
}
