package two.method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println("result = " + result);
    }

    public static boolean odd(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
