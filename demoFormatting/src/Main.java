public class Main {

    public static void main(String[] args) {
	    double samp1 = 2.3;
	    double samp2 = 40000.6;
	    double samp3 = 10002;
	    String str = "Gooday";

	    System.out.println(samp1);
	    System.out.printf("%.4f", samp1);
	    System.out.println();
        System.out.println(samp2);
        System.out.printf("%,.2f", samp2);
        System.out.println();
        System.out.println(samp3);
        System.out.printf("$%,.2f", samp3);
        System.out.println();
        System.out.printf("%10s", "hello!");
        System.out.println();
        System.out.printf("%20s %-10s", str, "mate");
        System.out.println();
        System.out.printf("%-20s", str);
        System.out.println();
        System.out.printf("%10s $%.2f", str, samp1);
        System.out.println();
    }
}
