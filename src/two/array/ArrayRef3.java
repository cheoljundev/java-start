package two.array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{80, 40, 50, 20, 10}; // 배열 생성과 초기화

        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

    }
}
