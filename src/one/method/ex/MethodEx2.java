package one.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMsg(3, message);
        printMsg(5, message);
        printMsg(7, message);
    }

    public static void printMsg(int n, String msg) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}