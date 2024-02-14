package codes.dayfour;

public class Dog extends Animal implements ABC {
    @Override
    public void sound() {
        System.out.println("Dog Sound");
        super.sound();
    }

    public Dog(Integer abc) {
        super(abc);
        System.out.println("ABC");
    }

    @Override
    public void abc() {

    }
}
