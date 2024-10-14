package two.cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 65;
        String rank;
        if (score >= 90) {
            rank = "A";
        } else if (score >= 80) {
            rank = "B";
        } else if (score >= 70) {
            rank = "C";
        } else if (score >= 60) {
            rank = "D";
        } else {
            rank = "F";
        }

        System.out.println("score : " + score);
        System.out.println("학점은 " + rank + "입니다.");
    }
}
