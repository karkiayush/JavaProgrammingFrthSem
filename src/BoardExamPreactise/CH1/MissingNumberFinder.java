
public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] arrayNum = { 1, 2, 5 };
        int starter = arrayNum[0];
        // int last = arrayNum[arrayNum.length];
        System.out.print("Missing elements: ");
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] != starter + i) {
                System.out.print(starter + i + " ");
            }
        }
    }
}
