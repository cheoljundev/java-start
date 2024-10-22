package two.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 학생 수를 입력하세요 : ");
        int studentCount = scanner.nextInt();
        int[][] students = new int[studentCount][3];

        for (int row = 0; row < students.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요 : ");
            System.out.print("국어 점수 : ");
            students[row][0] = scanner.nextInt();
            System.out.print("영어 점수 : ");
            students[row][1] = scanner.nextInt();
            System.out.print("수학 점수 : ");
            students[row][2] = scanner.nextInt();
        }

        for (int row = 0; row < students.length; row++) {
            int sum = 0;
            double average;
            for (int column = 0; column < students[row].length; column++) {
                sum += students[row][column];
            }
            average = (double) sum / 3;
            System.out.println((row + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
