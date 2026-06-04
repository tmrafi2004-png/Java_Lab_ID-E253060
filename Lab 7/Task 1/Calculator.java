public class Calculator {

    static int addition(int a, int b) {
        return a + b; 
    }

    static double addition(double a, double b) {
        return a + b;
    }

    static int addition(int t4, int n9, int m4) {
        return t4 + n9 + m4;
    }

    public static void main(String args[]) {
        System.out.println("Using the first method");
        System.out.println(addition(3, 3));

        System.out.println("\nUsing the second method");
        System.out.println(addition(2.3, 4.5));

        System.out.println("\nUsing the third method"); 
        System.out.println(addition(4, 9, 23));
    }
}