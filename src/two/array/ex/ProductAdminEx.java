package two.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        boolean running = true;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int count = 0;

        while (running) {
            System.out.print("1.상품 등록 | 2.상품 목록 | 3.종료\n메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    if (count >= maxProduct) {
                        System.out.println("상품이 모두 등록되었습니다.");
                        break;
                    }
                    System.out.print("상품명을 입력하세요 : ");
                    productNames[count] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[count] = scanner.nextInt();
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
                case 3:
                    System.out.println("프로그램 종료");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
