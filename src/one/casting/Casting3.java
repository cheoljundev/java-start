package one.casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue one.casting = " + intValue);

        intValue = (int) maxIntValue;
        System.out.println("maxIntOver one.casting = " + intValue);
    }
}
