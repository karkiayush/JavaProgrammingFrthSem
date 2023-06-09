package ClassCode;
//Driver code
public class JavaExceptionFst {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
//            double data = 55 / 3;
            System.out.println(data); //java.lang.ArithmeticException: / by zero


        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println(e); //Here the exception is bypassed which shouldn't be done.Thus, the exception must  be thrown
        }
    }
}
