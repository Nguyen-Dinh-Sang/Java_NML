package codes.dayone.homework;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoTen;
        int tuoi;


        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();

        //1
        System.out.println("<<" + hoTen + ">>năm nay<<" + tuoi + ">>tuổi");

        //2
        System.out.print("<<" + hoTen + ">>năm nay<<");
        System.out.print(tuoi + ">>tuổi");
        System.out.println();

        //3
        // String = %s
        // Int = %d
        // Double = %f
        System.out.printf("<<%s>>năm nay<<%d>>tuổi", hoTen, tuoi);

        double test = 123.456;
        System.out.printf("\nX = %f", test);
    }
}
