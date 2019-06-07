package Homework_2;

public interface Size {

    default void setHigh() {
        System.out.println("Hight");
    }

    static void setWide() {
        System.out.println("Wide");
    }

    abstract void setLenght();

}
