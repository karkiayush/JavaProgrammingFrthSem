package LabCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Array programming
 */
public class LabThree {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the " + numbers.length + " elements as your wish");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(numbers[0]);
        String numLength = String.valueOf(numbers[0]);
        System.out.println(numLength.length());

        // checking whether specific value exists or not, To be Researched
        boolean containingResult = Arrays.asList(numbers).contains(1);
        System.out.println(containingResult);

        // Integer[] number = { 1, 2, 3, 4, 5 };
        // boolean containingResults = Arrays.asList(number).contains(1);
        // System.out.println(containingResult); // Output: true

        double[] marks = new double[100];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = numbers[3] + i;
        }

        marks[50] = 11111;
        System.out.println(marks[50]);

        String[] fruits = { "apple", "orange", "banana", "kiwi" };
        Arrays.sort(fruits);
        // System.out.println(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        sc.close();
    }
}