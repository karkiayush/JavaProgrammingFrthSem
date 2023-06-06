package QuestionBank.TwentyTwoFall;

import java.util.Scanner;

// Wap to get 10 array elements from user and delete Xth position from array.
class OneA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax: type[] arrayName;
        int[] age = new int[10];
        int position;
        System.out.println("Enter 10 integer elements");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        System.out.print("Enter the position to delete(0-9):");
        position = sc.nextInt();

        if (position < 0 || position >= age.length) {
            System.out.println("Invalid position");
        } else {
            for (int i = position; i < age.length - 1; i++) {
                age[i] = age[i + 1];
            }

            System.out.println("Array after deletion");
            for (int a : age) {
                System.out.println(a);
            }
        }
        sc.close();
    }
}