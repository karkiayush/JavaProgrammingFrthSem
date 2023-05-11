class Computer {
    void compute() {
        String name = "computer";
        int length = name.length();
        System.out.println("Computer is computing device that wraps laptop and palmtop inside it");
        System.out.println("Length of word 'computer' is: " + length);
    }
}

class Laptop extends Computer {
    void computing() {
        System.out.println("Laptop is derived version of computer");
        /*System.out.println(name); name is not accessible since it is local to the compute method and though Laptop
        is extending the Computer class, local variable name is not accessible to computing() method*/
    }
}

class Palmtop extends Computer {
    void pam() {
        System.out.println("Palmtop is small computer");
    }
}

//Driver code
public class HierarchicalInheritance {
    public static void main(String[] args) {
        /*The statement Computer cm = new Palmtop(); creates an object of the class Palmtop and assigns it to a
        reference variable of type Computer named cm. This is an example of upcasting, where an object of a subclass is assigned to a reference variable of its superclass.*/
        Computer cm = new Palmtop();
        cm.compute();
        Palmtop pt = new Palmtop();
        pt.compute();
        System.out.println("Hierarchical Inheritance");
    }
}
