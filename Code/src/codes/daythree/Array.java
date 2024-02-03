package codes.daythree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Array {
    public static void main(String[] args) {
//        System.out.println(daysInMonth(3, 2024));
        String[] name = {"A", "B", "Linh"};
        System.out.println(name[2]);

        String[] name2 = new String[5];

        List<String> stringList = new ArrayList<>();
        stringList.add("Linh");
        stringList.add("Sang");
    }

    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Tháng không hợp lệ
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29;
        }

        return daysInMonth[month];
    }
}
