package codes.daytow.homework;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();

        switch (thang) {
            case 1:
                System.out.println("31 ngày");
                break;
            case 2:
                System.out.println("Xử lý sau");
                break;
            case 3:
                System.out.println("31 ngày");
                break;
            case 4:
                System.out.println("30 ngày");
                break;
            case 5:
                System.out.println("31 ngày");
                break;
            case 6:
                System.out.println("30 ngày");
                break;
        }

//        Các tháng có 31 ngày trong năm là tháng 1, 3, 5, 7, 8, 10 và 12.
//        Ngoài ra, trong năm có những tháng có 30 ngày là tháng 4, 6, 9 và tháng 11.
//        Riêng tháng 2 có 28 ngày (vào năm nhuận tháng 2 sẽ có 29 ngày).
    }
}
