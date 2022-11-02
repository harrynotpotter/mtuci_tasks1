package task1;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }

    private static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
}
