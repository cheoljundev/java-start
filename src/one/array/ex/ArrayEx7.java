package one.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < students.length; row++) {
            for (int column = 0; column < students[row].length; column++) {
                System.out.println((row + 1) + "번 학생의 성적을 입력하세요 :");
                System.out.print(subjects[column]+" 점수 : ");
                students[row][0] = scanner.nextInt();
            }
        }

        for (int row = 0; row < students.length; row++) {
            int sum = 0;
            double average;
            for (int column = 0; column < students[row].length; column++) {
                sum += students[row][column];
            }
            average = (double) sum / students[row].length;

            System.out.println((row + 1)+"번 학생의 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
