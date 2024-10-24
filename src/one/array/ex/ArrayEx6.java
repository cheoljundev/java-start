package one.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 :");

        int count = input.nextInt();
        int[] arr = new int[count];
        int min;
        int max;

        System.out.println(count+"개의 정수를 입력하세요 :");

        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }

        min = max = arr[0];

        for (int i : arr) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

    }
}
