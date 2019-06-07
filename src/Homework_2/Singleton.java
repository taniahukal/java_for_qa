package Homework_2;

public class Singleton {

    private static String instance = null;

    private Singleton() {
    }

    public static synchronized String getInstance() {
        if (instance == null)
            instance = new String();
        return instance;
    }
}
