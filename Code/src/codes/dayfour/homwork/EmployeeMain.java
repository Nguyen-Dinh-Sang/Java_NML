package codes.dayfour.homwork;

import java.util.Date;

public class EmployeeMain {
    public static void main(String[] args) {
        ProductionWorker productionWorker =
                new ProductionWorker("ABC",
                        "123-A",
                        new Date(2023, 2, 14),
                        1, 12.5);


        System.out.println(productionWorker.getShift());
    }
}
