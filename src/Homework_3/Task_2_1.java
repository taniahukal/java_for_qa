package Homework_3;

import java.util.Scanner;

public class Task_2_1 {

    public static void main (String args[] ) {

        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();

        int y = x1 + x2 + x3;

        int y1 = x1 * x2 * x3;

        int y2 = y / 3;

        int a[] = {x1, x2, x3};
        int min = a[0];
        for(int x: a) {
            if(x < min)
                min = x;
        }
        int max = a[0];
        for(int x: a) {
            if(x > max)
                max = x;
        }
        System.out.println("Output :" );
        System.out.println("Sum : " + y);
        System.out.println("Multiplication : " + y1 );
        System.out.println("Average : " + y2 );
        System.out.println("Max integer : " + max );
        System.out.println("Min integert :" + min );
        }
    }
