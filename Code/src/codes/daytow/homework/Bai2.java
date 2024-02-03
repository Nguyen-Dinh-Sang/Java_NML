package codes.daytow.homework;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        - Dưới 9 triệu: không đóng thuế.
//        - Từ 9 đến 15 triệu: thuế 10%.
//        - Từ 15 đến 30 triệu: 15%.
//        - Trên 30: 20%.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập cá nhân: ");
        double thuNhap = scanner.nextDouble();

        double thue = 0;
        if (thuNhap < 9000000) {
            thue = 0;
        } else if (thuNhap <= 15000000) {
            thue = thuNhap * 0.1;
        } else if (thuNhap <= 30000000) {
            thue = thuNhap * 0.15;
        } else {
            thue = thuNhap * 0.2;
        }
        System.out.println("   Thuế thu nhập cá nhân là: " + thue);
    }
}
