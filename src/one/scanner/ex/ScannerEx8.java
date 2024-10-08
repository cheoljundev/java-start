package one.scanner.ex;

import java.util.Scanner;

public class ScannerEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("숫자를 입력하세요. 중단하려면 -1를 입력하세요.");
        while (true){
            int num = input.nextInt();
            if(num == -1){
                System.out.println("입력한 숫자들의 합계 : " + sum);
                System.out.println("입력한 숫자들의 평균 : " + (double) sum / i);
                break;
            }
            sum += num;
            i++;
        }
    }
}
