package Homework_2;

public class Helicopter extends Vehicle implements Size {

    public void setHigh() {
        System.out.println("High");
    }

    public void setWide() {
        System.out.println("Wide");
    }

    public void setLenght() {
        System.out.println("Lenght");
    }

    Helicopter helicopter1 = new Helicopter();

    public void setNewValuesForHelikopter() {
        helicopter1.setHigh();
        helicopter1.setWide();
        helicopter1.setLenght();
    }

    int ampountOfPassangers;

    int maxHeight;

    int tankSize;

    @Override
    public void toLeft() {
        System.out.print("Helicopter to left");
    }

    @Override
    public void toRight() {
        System.out.print("Helicopter to right");
    }

    public void move () {
        System.out.println("Helicopter");
    }

    @Override

    public String toString() {

        return null;
    }

    @Override

    public int hashCode() {

        return 0;
    }

    @Override

    public String equals() {

        return null;
    }


}
