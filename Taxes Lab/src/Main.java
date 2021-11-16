import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String input;
	    String[] split;
	    double hours, rate, pay, netpay;

	    System.out.println("Please enter your job title, hours worked(per week), and hourly rate separated by commas.");
	    input = in.nextLine();

	    split = input.split(",");
        hours = Double.parseDouble(split[1]);
        rate = Double.parseDouble(split[2]);

        pay = hours * rate;

        netpay = (pay - ((pay * 0.15) + (pay * 0.0765) + (pay * 0.04)));

        System.out.printf("Your job title is %s, your paycheck is $%.2f, and your net pay is $%.2f", split[0], pay, netpay);
    }
}
