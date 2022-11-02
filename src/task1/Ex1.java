package task1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }

    private static int remainder(int dividend, int divider) {
        return dividend % divider;
    }
}
