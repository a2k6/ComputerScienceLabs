import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        String toOrFrom, input;
        double temp, convert;
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to convert to or from Celcius?");
        toOrFrom = in.nextLine();

        if (toOrFrom.contains("from") || toOrFrom.contains("From")){
            System.out.println("Please enter the temperature in degrees Celcius");
            input = in.nextLine();
            temp = Double.parseDouble(input);
            convert = 1.8 * temp + 32;
            System.out.printf("%.1f\u00B0C is %.1f\u00B0F.", temp, convert);
        } else {
            System.out.println("Please enter the temperature in degrees Farenheit");
            input = in.nextLine();
            temp = Double.parseDouble(input);
            convert = (temp - 32) / 1.8;
            System.out.printf("%.1f \u00B0F is %.1f\u00B0C.", temp, convert);
        }
    }
}
