package Homework_2;

public abstract class Bicycle extends Vehicle {

    public final int id;

    protected int gear;

    public Bicycle(int id) {
        this.id = id;
    }

    public Bicycle (int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public void changeGear (int value) {
        gear = value;
    }


    @Override
    public void move () {
        System.out.println("Bicycle");
    }

    @Override
    public String equals() {
        return null;
    }
}