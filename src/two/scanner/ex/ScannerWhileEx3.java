package two.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        int sum = 0;
        int index = 0;
        double average  = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                System.out.println("숫자의 합 : " + sum);
                average = (double) sum / index;
                System.out.println("숫자의 평균 : " + average);
                break;
            }
            sum += num;
            index++;
        }
    }
}
