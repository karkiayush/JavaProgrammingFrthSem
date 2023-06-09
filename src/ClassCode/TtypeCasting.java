package ClassCode;
// Parent class 
class A {
    int age;

    public void show1() {
        System.out.println("Method of Parent class");
    }
}

class B extends A {
    double marks;

    public void show2() {
        System.out.println("Method of child class");
    }
}

// Driver Code
public class TtypeCasting {
    public static void main(String[] args) {
        // object of parent class
        A obja = new A();
        obja.show1();

        // object of child class
        B objb = new B();
        objb.show2();
        objb.show1();
        System.out.println("\n");

        // making the object of child class to refrence of parent class i.e upcasting
        // which is done implicitly
        A obj1 = new B();
        obj1.show1();
        // obj1.show2(); not possbile though obj1 is the object of class B

        // Downcasting came to solve this issue
        B obj2 = (B) obj1;// hey even obj1 refers to the class A but you are the object of class B
        obj2.show2();
    }
}