package codes.daytow;

import com.sun.org.apache.regexp.internal.RE;

public class PrimitiveAndReference {
    public static void main(String[] args) {
        int a = 5;
        int a2 = 5;
        boolean b = true;
        double c = 9.5;

        Integer soNguyen = new Integer(5);
        Integer soNguyen2 = new Integer(5);

        if (a == a2) {
            System.out.println(a + "=" + a2);
        } else {
            System.out.println("Không bằng");
        }
        if (soNguyen == soNguyen2) {
            System.out.println("Bằng nhau");
        } else {
            System.out.println("Không bằng");
        }

        // static
        System.out.println("\n\n\nStatic:");

        Rectangle rectangle = new Rectangle();

        Rectangle.write();
        Rectangle.width = 5;

        System.out.println(Rectangle.width);

        // static
        System.out.println("\n\n\nPasing Objects as Arguments:");

        System.out.println(rectangle.getLength());
        Rectangle.updateRectangle(rectangle);
        System.out.println(rectangle.getLength());


        Rectangle rectangle2 = Rectangle.createNewRectangle();


        System.out.println(rectangle2.getLength());

        System.out.println("\n\n\nTo String:");
        System.out.println(rectangle2);

        System.out.println("\n\n\nSo sánh:");

        Rectangle.soSanh(rectangle, rectangle2);


        System.out.println("\n\n\nCopy:");
        Rectangle rectangle3 = new Rectangle(rectangle2);

        rectangle3.setLength(1000);
        System.out.println(rectangle2);

        Integer abc = rectangle2.getTest();
        abc = 10;

        System.out.println(rectangle2.getTest());
    }
}
