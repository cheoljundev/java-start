package two.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        print(3, message);
    }

    public static void print(int num, String message) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
