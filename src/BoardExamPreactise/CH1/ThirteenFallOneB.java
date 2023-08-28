public class ThirteenFallOneB {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print alternating 0 and 1 based on row and column indices
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
