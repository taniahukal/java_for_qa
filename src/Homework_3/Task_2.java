package Homework_3;

import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_2 {

public static void main (String args[] ) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int arraySize = in.nextInt();

    int[] array = new int[arraySize];

    for (int i = 0; i < arraySize; i++) {

        System.out.println("Enter the element:");

        array[i] = in.nextInt();
    }

    int mult = 1;
    for (int i = 0; i < arraySize; i++) {
        mult *=array[i];
    }

    int sum = IntStream.of(array).sum();

    int max = IntStream.of(array).max().getAsInt();

    int min = IntStream.of(array).min().getAsInt();

    double aver = IntStream.of(array).average().getAsDouble();

    System.out.println("Output :" );
    System.out.println("Sum : " + sum);
    System.out.println("Multiplication : " + mult );
    System.out.println("Average : " + aver );
    System.out.println("Max integer : " + max );
    System.out.println("Min integert :" + min );
}
}
