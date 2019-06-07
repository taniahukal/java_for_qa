package Homework_2;

public class RoadBicycle extends Bicycle {

    @Override
    public void toLeft() {
        System.out.print("Road bicycle to left");
    }

    @Override
    public void toRight() {
        System.out.print("Road bicycle to right");
    }

    static class Inner2 {
        public void innerClass2() {
            System.out.print("RoadBicycle");
        }
    }

    public void getInnerClass2 () {
        RoadBicycle.Inner2 inner2 = new Inner2();
        inner2.innerClass2();
    }


    public RoadBicycle(int id) {
        super(id);
    }

    private int rudderDepth = 30;

    public void setRudderDepth (int value) {
        rudderDepth = value;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }
}
