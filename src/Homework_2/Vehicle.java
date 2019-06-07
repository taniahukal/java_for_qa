package Homework_2;

public abstract class Vehicle {

    int speed = 90;
    private String model;

    public abstract void toLeft();
    public abstract void toRight();


    void SpeedUp(int value) {
        SpeedUp(90);
    }

    void applyBrake (int value) {
        applyBrake(60);
    }

    void setModel(String model) {
        setModel("Model");
    }

    String getModel(){
        return model;
    }

    public void move () {
        System.out.println("Vehicle");
    }

    final void stop () {
        stop();
    }

    public abstract String equals();
}
