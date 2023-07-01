package diffPackage;

import termtestI.termtestI.ProtectedAccessModifier;

//Accessed by the subclass of diff package
public class ProtSubClass extends ProtectedAccessModifier {
    public static void main(String[] args) {
        ProtSubClass psc = new ProtSubClass();
        System.out.println("Accessed by the subclass of diff package");
        psc.examMethod();
        System.out.println(psc.name);
    }
}
