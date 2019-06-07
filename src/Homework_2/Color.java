package Homework_2;

public interface Color {

    default void setColor() {
        System.out.println("Blue");
    }

    static void setColor2() {
        System.out.println("Red");
    }

    abstract void setColor3();


}
