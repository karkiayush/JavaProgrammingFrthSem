
public class ArrayEvenNumberAdder {
    public static int sumEvenNumbers(int[] arr) {
        int evenSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int result = sumEvenNumbers(numbers);
        System.out.println(result); // This will output 12, which is the sum of even numbers (2 + 4 + 6)
    }
}
