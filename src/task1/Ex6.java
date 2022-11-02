package task1;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\''));
    }

    private static int ctoa(char character) {
        return (int) character;
    }
}
