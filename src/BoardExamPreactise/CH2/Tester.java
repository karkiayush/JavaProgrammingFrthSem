package BoardExamPreactise.CH2;

public class Tester {
    void demoFunc() {
        System.out.println("Hello guys it is final func");
    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t.demoFunc();
        childTester ct = new childTester();
        ct.demoFunc();
    }
}

class childTester extends Tester {
    void demoFunc() {
        System.out.println("Overriding the parent function");
        super.demoFunc();
    }
}
