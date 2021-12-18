import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        double temp = 0, output, var = 25, var1 = 40;
        String confirm, values;
        String[] input;
        ArrayList<Double> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("\n" + "The average calculator is currently set to calculate the average of " + (int)var + " and " + (int)var1 + ".");
        System.out.println("Would you like to enter new values?" + "\n");

        confirm = in.nextLine();

        if(confirm.equals("yes") || confirm.equals("Yes") || confirm.equals("y") || confirm.equals("Y")){
            System.out.println("\n" + "Please enter the new values separated by spaces" + "\n");
        } else {
            output = (var + var1)/2;
            System.out.println("\n" + "The average of " + (int)var + " and " + (int)var1 + " is " + output + ".");
            System.exit(0);
        }

        values = in.nextLine();
        input = values.split(" ");

       for (var i = 0; i < input.length; i++){
            arr.add(Double.parseDouble(input[i]));
        }
       for (var i = 0; i < arr.size(); i++){
            temp += arr.get(i);
       }
       output = temp/arr.size();

       if (output % 1 == 0){
           System.out.print("\n" + "The average is " + (int)output + ".");
       }else {
           System.out.print("\n" + "The average is " + output + ".");
        }



    }
}