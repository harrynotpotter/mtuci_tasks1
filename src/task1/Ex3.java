package task1;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }

    private static int animals(int chicken, int cows, int pigs) {
        return chicken * 2 + cows * 4 + pigs * 4;
    }
}
