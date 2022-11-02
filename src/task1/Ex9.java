package task1;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes((new int[]{})));
    }

    private static int sumOfCubes(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i * i * i;
        }
        return sum;
    }
}
