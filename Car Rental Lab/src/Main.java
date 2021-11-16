import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	String mm, input;
    	String[] makeModel, lic;
        char first, second, third, prefixLetter;
        int letter, total, prefix, prefixValue;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your car's make and model.");
        mm = in.nextLine();
        makeModel = mm.split(" ");

        System.out.println("\nPlease enter your car's license plate.");
        input = in.nextLine();
        lic = input.split(" ");
        first = lic[0].charAt(0);
        second = lic[0].charAt(1);
        third = lic[0].charAt(2);
        letter = (int)first + (int)second + (int)third;
        total = letter + Integer.parseInt(lic[1]);
        prefix = total % 26;
        prefixValue = ((int)'A') + prefix;
        prefixLetter = (char)prefixValue;
        System.out.printf("\nYour car's make and model is: %s %s.  Your license plate is %s %s.  The rental company's code for your car is %c%d.", makeModel[0], makeModel[1], lic[0], lic[1], prefixLetter, total);
    }
}