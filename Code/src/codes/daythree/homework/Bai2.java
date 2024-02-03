package codes.daythree.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Integer[] arraySoNguyen = {1, 2, 4, 55, 1, 0, 10, 22, 33, 14};

        System.out.println("=====" + arraySoNguyen[new Scanner(System.in).nextInt()]);

        for (int index = 0; index < arraySoNguyen.length; index++) {
            System.out.println(arraySoNguyen[index]);
        }

        Arrays.sort(arraySoNguyen, Collections.reverseOrder());

        System.out.println("Sau khi sort");
        for (int index = 0; index < arraySoNguyen.length; index++) {
            System.out.println(arraySoNguyen[index]);
        }
    }
}
