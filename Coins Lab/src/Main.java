import java.lang.*;
import java.util.*;
//The line above imports the utility needed to gather the user's input

public class Main{

    public static void main(String[] args) {
        int input, cents, dollars, quarters, dimes, nickels, pennies;
		String dollar = " Dollar, ", quarter = " Quarter, ", dime = " Dime, ", nickel = " Nickel, and ", penny = " Penny.", doll = " Dollars, ", quart = " Quarters, ", dim = " Dimes, ", nick = " Nickels, and ", pen = " Pennies.", confirmation;
		//Creating variables for the different cases; if the amount of dollars in singular or plural.
		ArrayList<String> arr = new ArrayList<>();
		//Creating string that will later be used to change the conjugation of the output
	    Scanner in = new Scanner(System.in);
	    Scanner confirm = new Scanner(System.in);
		//Sets variable to a scanner that will gather the user's input when called later
	    System.out.println("Please enter the cent value and the most efficient way to deliver said value will be output shortly!");
	    input = in.nextInt();
		cents = input;
		//Creates a statement, gathers the user's input, and then sets a temporary variable(cents) to the value of input

		//Calculations for number of dollars, followed by the change, listed in half-dollars, quarters, dimes, nickels, and pennies
		dollars = cents / 100;
		if (dollars > 0){
			cents = cents - (dollars * 100);
		}

		quarters = cents / 25;
		if (quarters > 0){
			cents = cents - (quarters * 25);
		}

		dimes = cents / 10;
		if (dimes > 0){
			cents = cents - (dimes * 10);
		}

		nickels = cents / 5;
		if (nickels > 0){
			cents = cents - (nickels * 5);
		}

		pennies = cents;

		System.out.println("You input " + "$" + dollars + "." + (input-(dollars*100)) + ". " + "Is this the correct value?(Please respond with either yes or no)");
		confirmation = confirm.nextLine();

		if (confirmation.equals("yes") || confirmation.equals("Yes") || confirmation.equals("y") || confirmation.equals("Y")) {
			System.out.println("\n" + "Confirmed. Calculating. . . ");
		}else {
			System.exit(0);
		}

		//If statements to correct the grammar of the output statement
		if (dollars == 1){
			arr.add(dollar);
		}else {
			arr.add(doll);
		}

		if (quarters == 1){
			arr.add(quarter);
		}else {
			arr.add(quart);
		}

		if (dimes == 1){
			arr.add(dime);
		}else {
			arr.add(dim);
		}

		if (nickels == 1){
			arr.add(nickel);
		}else {
			arr.add(nick);
		}

		if (pennies == 1){
			arr.add(penny);
		}else {
			arr.add(pen);
		}

		System.out.println("\n" + "In order to give proper change, you need to give: " + dollars + arr.get(0) + quarters + arr.get(1) + dimes + arr.get(2) + nickels + arr.get(3) + pennies + arr.get(4));
    }
}
