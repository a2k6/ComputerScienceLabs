import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numFriends;
        double remainder, perTicketCost, friendCost, snackCost, mon, payCheck;

        System.out.println("You've just received your first paycheck, and will use it to treat some friends to a movie.");
        System.out.println("Enter the amount of your paycheck to two decimal places");
        payCheck = s.nextDouble();

        System.out.println("\nEnter the cost of a movie ticket to two decimal places");
        perTicketCost = s.nextDouble();

        System.out.println("\nEnter the number of friends you plan to bring");
        numFriends = s.nextInt();

        System.out.println("\nEnter the cost of the snacks(per person) to two decimal places");
        snackCost = s.nextDouble();

        int totalGroup = numFriends + 1;

        remainder = payCheck-(perTicketCost*totalGroup);
        System.out.printf("\nYou have $%.2f left over for snacks.", remainder);

        mon = (remainder - (snackCost * totalGroup));
        if(mon >= 0){
            System.out.printf("You can cover the total cost of snacks");
        }
        else {
            mon -= 2 * mon;
            friendCost = mon/totalGroup;
            System.out.printf("Each of your friends will have to contribute $%.2f to cover the cost of snacks", friendCost);
        }


    }
}
