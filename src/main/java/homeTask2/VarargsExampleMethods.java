package homeTask2;

public class VarargsExampleMethods {
    public static int sumNumber(int a, int b) {
        return a + b;
    }

    public static int sumNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public static boolean negate(boolean b, int... args) {
        return !b;
    }
}
