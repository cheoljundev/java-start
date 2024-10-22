package two.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();
        System.out.println(count + "개의 정수를 입력하세요 : ");
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        double average;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        average = (double) sum / arr.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
    }
}
