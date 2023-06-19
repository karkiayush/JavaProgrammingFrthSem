package termtestI;

// With in same package 
public class SubClassProt extends ProtectedAccessModifier {
    public static void main(String[] args) {
        SubClassProt sb = new SubClassProt();
        System.out.println("Accessed by subclass With in the same package");
        sb.examMethod();
        System.out.println(sb.name);
    }
}
