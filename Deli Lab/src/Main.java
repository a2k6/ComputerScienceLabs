import java.lang.*;
import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String[] options = {"Yes", "No"};
	    String item;
	    double price, defaultCost, shippingCost;

	    System.out.println("What is the name of the item you wish to purchase?");
		item = in.nextLine();

	    System.out.println("What is the price of the item you wish to purchase?(Please enter without the dollar sign)");
		defaultCost = in.nextDouble();
		in.close();

		price = defaultCost;

		if(price < 10){
			price += 2;
			shippingCost = 2;
		}else{
			price +=3;
			shippingCost = 3;
		}

	    String overnightShipping = (String) JOptionPane.showInputDialog(
	    		null, "Would you like overnight shipping?", "Overnight Shipping", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if(overnightShipping.equals("Yes")){
			price += 5;
			shippingCost += 5;
		}

		System.out.printf("You requested item: %s for $%.2f.\nThe fee for shipping and delivery is $%.2f.\nThe total cost is $%.2f.", item, defaultCost, shippingCost, price);
    }
}