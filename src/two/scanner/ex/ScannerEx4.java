package two.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 번째 단을 출력할까요 ? : ");
        int dan = scanner.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " * " + (i + 1) + " = " + dan * (i + 1));

        }
    }
}
