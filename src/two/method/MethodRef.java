package two.method;

public class MethodRef {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력 : " + sum1);

        System.out.println("=========================");

        // 계산2
        int sum2 = add(25, 10);
        System.out.println("결과 2 출력 : " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
