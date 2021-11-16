import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	    String clothingType;
	    double cost, costTax, totalCost;
	    boolean tax;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the name of the piece of clothing you purchased.");
        clothingType = in.nextLine();

        System.out.println("Enter the cost of the piece of clothing you purchased.(Do not include the dollar sign)");
        cost = in.nextDouble();

        if (cost >= 100){
            tax = true;
        }else {
            tax = false;
        }

	    if (tax){
	        totalCost = cost * 1.05;
	        costTax = cost * 0.05;
        } else {
	        totalCost=cost;
	        costTax = 0;
        }

	    System.out.printf("Thank you for purchasing %s.\nThe price before tax is $%.2f.\nThe tax is $%.2f.\nYour total cost is $%.2f.", clothingType, cost, costTax, totalCost);
    }
}
