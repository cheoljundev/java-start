package two.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean running = true;
        while (running) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("상품명을 입력하세요 : ");
                    String name = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("상품 수량을 입력하세요 : ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    int result = price * quantity;
                    System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + quantity);
                    total += result;
                    break;
                case 2:
                    System.out.println("총 비용 : " + total);
                    total = 0;
                    break;
                case  3:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
