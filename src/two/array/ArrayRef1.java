package two.array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 50;
        students[2] = 60;
        students[3] = 20;
        students[4] = 30;

        System.out.println("학생 1 점수 : " + students[0]);
        System.out.println("학생 2 점수 : " + students[1]);
        System.out.println("학생 3 점수 : " + students[2]);
        System.out.println("학생 4 점수 : " + students[3]);
        System.out.println("학생 5 점수 : " + students[4]);

    }
}
