package Homework_1;

import java.util.Scanner;

public class Task_3 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = in.nextInt();

        String hex = Integer.toHexString(dec);

        System.out.println("Decimal to hexadecimal: " + hex);

    }
}
