package two.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요 (exit는 종료) : ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("이름은 " + name + ", 나이는 " + age + "살입니다.");
        }
    }
}
