package task1;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }

    private static String operation(int N, int a, int b) {
        if (a * b == N) return "multiplied";
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a / b == N) return "divided";
        else return "none";
    }

}
