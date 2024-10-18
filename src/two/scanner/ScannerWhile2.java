package two.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요.(둘 다 0이면 종료) : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요.(둘 다 0이면 종료) : ");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("두 숫자의 합: " + (num1 + num2));
        }

    }
}
