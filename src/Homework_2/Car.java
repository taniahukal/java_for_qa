package Homework_2;

public class Car extends Vehicle  {

    class Inner {
        public void innerClass() {
            System.out.print("Car");
        }
    }

    public void getInnerClass() {
        Car.Inner inner = new Car().new Inner();
        inner.innerClass();
    }

    static String carType;

    static String transmission;

    Car car1 = new Car();

    public void setValueForCar() {
        car1.setValueForCar();
    }

    public void setValueForCar(String s) {
        car1.setValueForCar("My car");
    }

    public void setValueForCar (String a, int b) {
        car1.setValueForCar("My new car", 100);
    }


    @Override
    public void toLeft() {
        System.out.print("Car to left");
    }

    @Override
    public void toRight() {
        System.out.print("Car to right");
    }

    @Override
    public String equals() {
        return null;
    }



}
