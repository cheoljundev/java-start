package two.array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 50;
        students[2] = 60;
        students[3] = 20;
        students[4] = 30;

        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

    }
}
