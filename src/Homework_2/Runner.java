package Homework_2;

public class Runner {

    public static void main (String args[]) {

        MountainBicycle mountainBicycle1 = new MountainBicycle(52, 66);
        MountainBicycle mountainBicycle2 = new MountainBicycle(89,33);

        mountainBicycle1.setSeatHeight(90);
        mountainBicycle2.getSeatHeight();

        RoadBicycle roadBicycle1 = new RoadBicycle(7);
        RoadBicycle roadBicycle2 = new RoadBicycle(9);

        roadBicycle1.setRudderDepth(90);
        roadBicycle2.getRudderDepth();

        Car.transmission = "transmission1";
        Car.carType = "car";

        System.out.println(Car.transmission);
        System.out.println(Car.carType);

    }

}
