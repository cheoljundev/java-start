package two.loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 3;
        int count = 1;
        while (count <= max) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
