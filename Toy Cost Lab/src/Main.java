import java.util.*;
import java.lang.*;

public class Main {
//If cost is over $20, 15% discount.  All toys have 7% tax(after discount if applied).
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        double cost, withDiscount, withTax;

        System.out.println("Please enter the name of your toy.");
        name = in.nextLine();

        System.out.println("Please enter the cost of your toy before tax(without the dollar sign).");
        cost = in.nextDouble();

        if(cost >= 20){
            withDiscount = cost * 0.85;
            withTax = withDiscount * 1.07;
        }else {
            withTax = cost * 1.07;
        }

        System.out.printf("You bought a %s for $%.2f. The cost after tax is $%.2f.", name, cost, withTax);
    }
}
