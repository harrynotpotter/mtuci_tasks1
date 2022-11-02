package task1;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }

    private static int addUpTo(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
