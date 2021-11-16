import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	    String input, fname, lname, repeat;
	    int age, grade;
	    double gradePointAverage;
        String[] processing;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Please enter your first and last name, age, grade, and GPA in this order and all separated by spaces.");
	    input = in.nextLine();

	    processing = input.split(" ");

	    fname = processing[0];
        lname = processing[1];
        age = Integer.parseInt(processing[2]);
        grade = Integer.parseInt(processing[3]);
        gradePointAverage = Double.parseDouble(processing[4]);


        System.out.printf("Your name is %s %s.\nYour last name has %d letters.\nThe second letter of your first name is %s.\nThe last letter of your first name is %s.\nYou are %d years old.\nYou are in the %dth grade.\nYour GPA is %.2f", fname, lname, lname.length(), fname.charAt(1), fname.charAt((fname.length()) - 1), age, grade, gradePointAverage);
        System.out.println("\nThis data has been indexed.  If you would like a specific piece of information to be repeated, please enter the number that corresponds with that value.\n");
        repeat = in.nextLine();
        if (Integer.parseInt(repeat) == 1){
            System.out.println("\nYour first name is " + processing[0]);
        }
        if (Integer.parseInt(repeat) == 2){
            System.out.println("\nYour last name is " + processing[1]);
        }
        if (Integer.parseInt(repeat) == 3){
            System.out.println("\nYour age is " + processing[2]);
        }
        if (Integer.parseInt(repeat) == 4){
            System.out.println("\nYour grade is " + processing[3]);
        }
        if (Integer.parseInt(repeat) == 5){
            System.out.println("\nYour GPA is " + processing[4]);
        }
    }
}