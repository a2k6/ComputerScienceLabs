import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String input5 = s.nextLine();
        System.out.println(input5);
        System.out.println( "What is your first name?");
        String firstName = s.nextLine();
        System.out.printf ("Great, I see you, %s!", firstName);
        System.out.println();

        int qty;
        System.out.println("How many burgers do you want?");
        qty = s.nextInt();
        System.out.printf ("You're buying %d items today", qty);
        System.out.println();

        double price;
        System.out.println("What is the per item price?(Do not enter the dollar sign the program will do that for you)");
        price = s.nextDouble();
        System.out.printf("Per item price is $%.2f.", price);
        System.out.println();

        System.out.printf("%s bought %d items for $%.2f each, totaling $%.2f.", firstName, qty, price, qty * price);
        System.out.println();

    }
}
