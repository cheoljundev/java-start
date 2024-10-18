package two.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        Integer result = num1 == num2 ? null :
                num1 > num2 ? num1 : num2;
        if (result == null) {
            System.out.println("두 수는 같습니다.");
        } else {
            System.out.println("더 큰 숫자는 ? : " + result);
        }
    }
}
