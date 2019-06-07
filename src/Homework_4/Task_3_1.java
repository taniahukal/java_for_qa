package Homework_4;

import java.util.Scanner;

public class Task_3_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("String 1:");
        String string1 = in.nextLine().toString();

        in = new Scanner(System.in);
        System.out.println("String 2:");
        String string2 = in.nextLine().toString();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println(string1 + " is equal to " + string2);
        } else {
            System.out.println(string1 + " is not equal to " + string2);
        }

    }
}
