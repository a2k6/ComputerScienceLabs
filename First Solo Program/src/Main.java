import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        String user;

        user = in.nextLine();
        for (var i = 0; i < user.length(); i++){
            input.add((int)user.charAt(i));
        }
        for (var i = 0; i < input.size(); i++){
            System.out.println(input.get(i) + " ");

        }

    }
}