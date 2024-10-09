package two.operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다
        boolean reault = a > 10 && a < 20; // (a > 10) && (a < 20)
        System.out.println("reault = " + reault);
    }
}
