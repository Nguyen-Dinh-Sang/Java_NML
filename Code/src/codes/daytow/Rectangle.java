package codes.daytow;

public class Rectangle {
    private int length;
    public static int width;
    private Integer test;

    public int getLength() {
        return length;
    }

    public Integer getTest() {
        return test;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void write() {
        System.out.println("Đây là hình chữ nhật: " + width);
    }

    public static void updateRectangle(Rectangle rectangle) {
        rectangle.setLength(10);
    }

    public static Rectangle createNewRectangle() {
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setLength(10);
        rectangle3.setLength(100);

        System.out.println("==========:" + rectangle3.getLength());

        return rectangle3;
    }

    @Override
    public String toString() {
        return "Không in địa chỉ nữa: " +  length;
    }

    public static void soSanh(Rectangle rectangle, Rectangle rectangle2) {
        if (rectangle.test.equals(rectangle2.test)) {
            System.out.println("2 hình bằng nhau.");
        } else {
            System.out.println("2 hình không bằng nha.");
        }
    }

    public Rectangle(Rectangle raw) {
        this.length = raw.getLength();
    }

    public Rectangle() {

    }
}

