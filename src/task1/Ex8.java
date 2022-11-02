package task1;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }

    private static int nextEdge(int a, int b) {
        return a + b - 1; //по одному из свойств треугольника: любая сторона треугольника больше разности двух других и меньше суммы
    }
}
