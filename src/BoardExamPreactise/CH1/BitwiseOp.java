
public class BitwiseOp {
    public static void main(String[] args) {
        int a = 25; // Binary: 11001
        int b = 18; // Binary: 10010

        int resultAnd = a & b;
        int resultOr = a | b;
        int resultXor = a ^ b;
        int resultNotA = ~a;
        int leftShiftA = a << 2;
        int rightShiftB = b >> 1;
        int unsignedRightShiftB = b >>> 1;

        System.out.println("a & b (AND): " + resultAnd);
        System.out.println("a | b (OR): " + resultOr);
        System.out.println("a ^ b (XOR): " + resultXor);
        System.out.println("~a (NOT a): " + resultNotA);
        System.out.println("a << 2 (Left Shift): " + leftShiftA);
        System.out.println("b >> 1 (Right Shift): " + rightShiftB);
        System.out.println("b >>> 1 (Unsigned Right Shift): " + unsignedRightShiftB);
    }
}
