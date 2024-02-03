package codes.daytow.homework;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số A: ");
        int soA = scanner.nextInt();
        System.out.print("Nhập số B: ");
        int soB = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nhập phép tính: ");
        String phepTinh = scanner.nextLine();

        if (phepTinh.equals("+")) {
            System.out.println(soA + " + " + soB + " = " + (soA + soB));
        } else
        if (phepTinh.equals("-")) {
            System.out.printf("%d - %d = %d\n", soA, soB, soA - soB);
        } else
        if (phepTinh.equals("*")) {
            System.out.printf("%d * %d = %d\n", soA, soB, soA * soB);
        } else
        if (phepTinh.equals("/")) {
            System.out.printf("%d / %d = %d\n", soA, soB, soA / soB);
        }
    }
}
