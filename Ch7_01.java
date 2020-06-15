package ch7;

public class Ch7_01 {

    public static int a;
    public static int b;

    public static void main(String[] args) {

        System.out.println(max(a,b));

    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}
