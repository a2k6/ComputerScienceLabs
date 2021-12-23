import java.util.*;
import java.lang.*;
//What do each of these import statements do?

public class Main {
//What does this statement do?

    public static void main(String[] args) {
    //Does the String[] args in the above statement need to be there for it to function properly?

        double g = "1.0";
        //Why isn't this variable properly initialized?

        Scanner s = new Scanner();
        //Why won't this scanner take any input from the user?
        
        if (g < 0) 
        System.out.print("Hello");
        System.out.println("World");
        //What would the output of the above code be?
        
        boolean t = true, f = false;
        if (t && f){
            System.out.println("Option 1");
        } else{
            System.out.println("Option 2");
        }
        //What would the output be from this if/else statement

        double test = (int)3.9;
        double tested = (int)3.5;
        //What will the initialized values of these vairables be?
        
        char testing = 48;
        //What will this variable equal?
    }
}