package task1;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    private static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a % c == 0;
    }
}
