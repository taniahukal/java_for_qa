package Homework_1;

import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int c = a*b;
        System.out.println("Output: " + c);
        in.close();
    }
}
