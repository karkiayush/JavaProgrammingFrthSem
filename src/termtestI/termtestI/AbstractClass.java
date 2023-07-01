package termtestI.termtestI;

abstract class Sunstar {
    abstract void printInfo();
}

abstract class Sunstar1 {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

}

// Base class
class AbstractClass {
    public static void main(String args[]) {
        Employee s = new Employee();
        s.printInfo();
    }
}