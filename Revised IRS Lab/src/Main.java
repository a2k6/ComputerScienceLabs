import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String singleOrMarried;
	    double income, tax, takeHome;

	    System.out.println("Are you married or single?");
	    singleOrMarried = in.nextLine();

	    System.out.println("What is your current taxable income?(Please enter without the dollar sign or comma(s))");
        income = in.nextDouble();

	    if (singleOrMarried.equals("Single") || singleOrMarried.equals("single")){
            if (income <= 9325)
                tax = income * 0.1;
            else if (income <= 37950)
                tax = 932.5 + ((income - 9325) * 0.15);
            else if (income <= 91900)
                tax = 5226.25 + ((income - 37950) * 0.25);
            else if (income <= 191650)
                tax = 18713.75 + ((income - 91900) * 0.28);
            else if (income <= 416700)
                tax = 46643.75 + ((income - 191650) * 0.33);
            else if (income <= 418400)
                tax = 120910.25 + ((income - 416700) * 0.35);
            else
                tax = 121505.25 + ((income - 418400) * 0.396);
        }else{
            if (income <= 18650)
                tax = income * 0.1;
            else if (income <= 75900)
                tax = 1865 + ((income - 18650) * 0.15);
            else if (income <= 153100)
                tax = 10452.50 + ((income - 75900) * 0.25);
            else if (income <= 233350)
                tax = 29752.50 + ((income - 153100) * 0.28);
            else if (income <= 416700)
                tax = 52222.50 + ((income - 233350) * 0.33);
            else if (income <= 470700)
                tax = 112728 + ((income - 416700) * 0.35);
            else
                tax = 131628 + ((income - 470700) * 0.396);
        }

	    takeHome = income - tax;

	    System.out.printf("You are %s and your gross income is $%,.2f.\nYou have to pay $%,.2f in taxes this year.\nYou will take home $%,.2f this year.", singleOrMarried, income, tax, takeHome);
    }
}
