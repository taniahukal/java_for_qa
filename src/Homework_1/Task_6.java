package Homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int [] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int a = 2; a < n; ++a) {
            arr[a] = arr[a - 1] + arr[a - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
