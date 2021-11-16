import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] process;
        ArrayList<String> processed = new ArrayList<>();
        String input, first, last;
        int length;

        System.out.println("Please enter a word or phrase to be converted to pig latin. If entering a phrase, please do not include punctuation");
        input = in.nextLine();
        process = input.split(" ");

        for (var i = 0; i < process.length; i++){
            length = process[i].length();
            first = Character.toString(process[i].charAt(0));
            last = Character.toString(process[i].charAt(length - 1));
            processed.add(first + last + "ay");
        }

        System.out.print("\nYour input was: " + input + "\nIn pig latin, this is: ");
        for (var i = 0; i < processed.size(); i++){
            System.out.print(processed.get(i) + " ");
        }

    }
}
