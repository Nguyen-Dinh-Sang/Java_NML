package codes.dayone.homework;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soA;
        double soB;

        System.out.print("Nhập số A: ");
        soA = scanner.nextDouble();
        System.out.print("Nhập số B: ");
        soB = scanner.nextDouble();

        double luyThua = Math.pow(soA, soB);
        double soNhoNhat = Math.min(soA, soB);

        System.out.println("Lũy thừa: " + luyThua);
        System.out.println("Số nhỏ nhất: " + soNhoNhat);
    }
}
