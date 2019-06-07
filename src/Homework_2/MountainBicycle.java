package Homework_2;

public class MountainBicycle extends Bicycle implements Color {

    public void setColor() {
        System.out.println("Green");
    }

    public void setColor2() {
        System.out.println("White");
    }

    public void setColor3() {
        System.out.println("Violet");
    }

    MountainBicycle mountainBicycle1 = new MountainBicycle(60, 80);
    MountainBicycle mountainBicycle2 = new MountainBicycle(50, 70);
    MountainBicycle mountainBicycle3 = new MountainBicycle(10,90);

    public void setColorsForBicycles() {
        mountainBicycle1.setColor();
        mountainBicycle2.setColor2();
        mountainBicycle3.setColor3();
    }

    public MountainBicycle(int id, int gear) {
        super(id, gear);
    }

    private int seatHeight;

    public void setSeatHeight (int value) {
         seatHeight = value;
    }

    public int getSeatHeight () {
        return seatHeight;
    }

    @Override
    public void toLeft() {
        System.out.print("Mountain bicycle to left");
    }

    @Override
    public void toRight() {
        System.out.print("Mountain bicycle to right");
    }
}
