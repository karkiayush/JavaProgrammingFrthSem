package termtestI;

// import javax.sound.sampled.SourceDataLine;

/**
 * ProtectedAccessModifier
 */

// Main class
public class ProtectedAccessModifier {
    protected String name = "John";

    public static void main(String[] args) {

        // within the same class
        ProtectedAccessModifier pam = new ProtectedAccessModifier();
        System.out.println("With in the same class");
        System.out.println(pam.name);
        pam.examMethod();
    }

    protected void examMethod() {
        System.out.println("Hello, its protected exam method");
    }
}
