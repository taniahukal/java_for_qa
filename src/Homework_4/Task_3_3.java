package Homework_4;

import java.util.Scanner;

public class Task_3_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("The given string is: ");
        String string = in.nextLine();

        System.out.println("The string in reverse order is: ");
        for(int i=string.length(); i>0; --i) {
            System.out.print(string.charAt(i-1));
        }
    }
}

