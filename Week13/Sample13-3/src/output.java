public class output {
    public static void display(String title, int value) {
        System.out.printf("%s : %,d Cm\n", title, value);
    }

    public static void display(String title, double value) {
        System.out.printf("%s : %,.2f ㎠\n", title, value);
    }
}