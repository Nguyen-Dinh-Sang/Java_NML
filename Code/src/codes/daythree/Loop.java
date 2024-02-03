package codes.daythree;

public class Loop {
    public static void main(String[] args) {
//        whileLoop();
//        forLoop();
        breakAndContinue();
    }

    public static void whileLoop() {
        int index = 1;

        while (index < 20) {
            System.out.println(index);
            index++;
        }

        index = 1;
        do {
            System.out.println("=" + index);
            index++;
        } while (index < 20);
    }

    public static void forLoop() {
        for (int index = 1; index <= 10; index+=2) {
            System.out.println("2 * " +  index + " = " + 2 * index);
        }
    }

    public static void breakAndContinue() {
        for (int index = 0; index <= 10; index++) {
            System.out.println("2 * " +  index + " = " + 2 * index);
            if (index == 8) {
                break;
            }

            if (index == 4) {
                continue;
            }

            System.out.println("Continue");
        }

        System.out.println("End");
    }
}
