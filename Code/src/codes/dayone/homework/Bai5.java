package codes.dayone.homework;

import java.util.Random;

public class Bai5 {

    public static void main(String[] args) {
        Random rand = new Random();

        // nextInt(8) = 0 -> 7
        int x = rand.nextInt((12 - 5 + 1)) + 5;

        double canbac2 = Math.sqrt(x);
        System.out.println("Căn bậc 2 của " + x + " là: "+ canbac2);
    }
}
