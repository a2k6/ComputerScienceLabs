public class Main {

    public static void main(String[] args) {
        String a = "Any old";
        String b = " String";
        System.out.println(a);
        System.out.println(b);

        String comboString = a + b; //concatenation
        System.out.println(comboString);

        //String Methods in use
        char ch = comboString.charAt(5); //character at a specific position
        System.out.println("char at position 5 is " + ch);

        int pos = comboString.indexOf('y'); //position of a certain character
        System.out.println("position of y is " + pos);

        int stringLength = comboString.length();;
        System.out.println(stringLength);  //Length of the string

        char lastLetter;
        lastLetter = comboString.charAt(stringLength - 1); //getting Last letter of a string
        System.out.println(lastLetter);
    }
}
