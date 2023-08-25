package BoardExamPreactise.CH1;

import java.util.*;

public class TTFallOneA {
    public static void main(String[] args) {
        int[] userInput = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten array elements");
        for (int i = 0; i < 10; i++) {
            userInput[i] = sc.nextInt();
        }

        System.out.print("Enter the position whose element is to be deleted: ");
        int x = sc.nextInt();

        System.out.print("User have entered 10 elements as: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(userInput[i] + ",");
        }
        System.out.println();

        System.out.println("We have deleted element at position number: " + x + " whose value is: " + userInput[x]);
        for (int i = x; i < userInput.length - 1; i++) {
            userInput[i] = userInput[i + 1];
        }
        userInput[userInput.length - 1] = 0;// 9th postion ko eleement ma null haleko

        System.out.print("Array element after deletio is : ");
        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i] + ", ");
        }

    }
}
