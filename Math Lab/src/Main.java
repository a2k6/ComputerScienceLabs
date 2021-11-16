public class Main {

    public static void main(String[] args) {
        String txt = "4 + 12", txt1 = "41 / 7", txt2 = "57 % 7", txt3 = "5 * 3.0", txt4 = "7 / 2", txt5 = "7/2.0", txt6 = "(double)25 / 4", txt7 = "(int)9.75 + 2", txt8 = "(int)'h'", txt9 = "(char)105", txt10 = "5/2", txt11 = "(int)4.5 / (double)10";
        int num = 4 + 12, num1 = 41 / 7, num2 = 57 % 7, num4 = 7 / 2, num7 = (int)9.75 + 2, num8 = 'h';
        double num3 = 5 * 3.0, num5 = 7/2.0, num6 = (double)25 / 4, num10 = 5/2, num11 = (int)4.5 / (double)10;
        char num9 = (char)105;
        System.out.format(" The output of %s is %d. %n The output of %s is %d. %n The output of %s is %d. %n The output of %s is %f. %n The output of %s is %d. %n The output of %s is %f. %n The output of %s is %f. %n The output of %s is %d. %n The output of %s is %d. %n The output of %s is %s. %n The output of %s is %f. %n The output of %s is %f. %n", txt, num, txt1, num1, txt2, num2, txt3, num3, txt4, num4, txt5, num5, txt6, num6, txt7, num7, txt8, num8, txt9, num9, txt10, num10, txt11, num11);
    }
}