package codes.daythree.homework;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Nhập điểm từ bàn phím, với điều kiện điểm từ 0 - 10 nếu điểm khác thì bắt nhập lại.

        Scanner scanner = new Scanner(System.in);
        int diem;
        do {
            System.out.print("Nhập điểm: ");
            diem = scanner.nextInt();
        } while (diem < 0 || diem > 10);
        System.out.println("Điểm hợp lệ: " + diem);
    }
}
