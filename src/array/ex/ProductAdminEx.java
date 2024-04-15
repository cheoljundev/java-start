package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[1];
        int[] productPrices = new int[1];
        int productCount = 0;

        while (true) {
            System.out.println("1.상품 등록|2.상품 목록|3.종료");
            System.out.print("메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

                String[] productNamesTemp = new String[productCount+1];
                int[] productPricesTemp = new int[productCount+1];

                for (int i = 0; i < productCount; i++) {
                    productNamesTemp[i] = productNames[i];
                    productPricesTemp[i] = productPrices[i];
                }

                productNames = productNamesTemp;
                productPrices = productPricesTemp;

            } else if (option == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
