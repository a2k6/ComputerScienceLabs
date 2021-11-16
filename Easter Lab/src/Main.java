import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        int year;
        int ansA, ansB, ansC, ansD, ansE, ansF, ansG, ansH, ansI, ansJ, ansK, ansL, month, oneLessThanDay, day;
        String confirm, mon;

        Scanner in = new Scanner(System.in);
        Scanner confirmation = new Scanner(System.in);

        System.out.println("Please enter the year for which you would like the day for Easter to be found.");
        year = in.nextInt();

        System.out.println("\n" + "Is " + year + " your year?");
        confirm = confirmation.nextLine();

        if (confirm.equals("yes") || confirm.equals("Yes") || confirm.equals("y") || confirm.equals("Y")) {
            System.out.println("\n" + "Confirmed. Calculating . . ." + "\n");
        }else {
            System.exit(0);
        }

        ansA = year % 19;
        ansB = year / 100;
        ansC = year % 100;
        ansD = ansB / 4;
        ansE = ansB % 4;
        ansF = (ansB + 8) / 25;
        ansG = (ansB - ansF + 1) / 3;
        ansH = (19 * ansA + ansB - ansD - ansG + 15) % 30;
        ansI = ansC / 4;
        ansJ = ansC % 4;
        ansK = (32 + 2 * ansE + 2 * ansI - ansH - ansJ) % 7;
        ansL = (ansA + 11 * ansH + 22 * ansK) / 451;
        month = (ansH + ansK - 7 * ansL + 114) / 31;
        oneLessThanDay = (ansH + ansK - 7 * ansL + 114) % 31;
        day = oneLessThanDay + 1;

        if (month == 3 ){
            mon = "March";
        }else {
            mon = "April";
        }

        System.out.println("In " + year + ", Easter occurred on " + mon + " " + day + ". " + "The numerical date value would be " + month + "/" + day + ".");

    }
}
