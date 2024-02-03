package codes.dayone.homework;

import java.util.Scanner;

public class Bai5V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int x = scanner.nextInt();

        if (x >= 0)  {
            double canbac2 = Math.sqrt(x);
            System.out.println("Căn bậc 2 của " + x + " là: "+ canbac2);
        } else {
            System.out.println("Không phải số dương");
        }
    }
}
