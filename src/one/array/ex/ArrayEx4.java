package one.array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int average = 0;

        System.out.println("5개의 정수를 입력하세요 :");

        for (int i = 0; i < arr.length; i++) {
            int num = input.nextInt();
            arr[i] = num;
            sum += num;
        }

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + (double) sum / arr.length);

    }
}
