package ch7;

public class Ch7_02 {

    public static void main(String[] args) {

        int a = 10;
        int b = 25;

        double c = (a + b) / 2;
        System.out.println(c);

        c = (a + b) / 2.0;
        System.out.println(c);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}
