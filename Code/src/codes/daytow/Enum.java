package codes.daytow;

public class Enum {
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATURDAY}

    public static void main(String[] args) {
        Day toDay = Day.SATURDAY;

        System.out.println(toDay.toString());

        switch (toDay) {
            case SATURDAY:
                System.out.println("saturday");
                break;
            case FRIDAY:
                System.out.println("friday");
                break;
            case SUNDAY:
                System.out.println("sunday");
                break;
        }
    }
}
