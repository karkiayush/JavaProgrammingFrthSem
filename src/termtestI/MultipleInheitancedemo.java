package termtestI;



class ClassA {
    public void display() {
        System.out.println("ClassA");
    }
}

class ClassB {
    public void display() {
        System.out.println("ClassB");
    }
}

class MultipleInheitancedemo extends ClassA, ClassB { // Compilation error: Multiple inheritance not allowed
    public static void main(String[] args) {
        MultipleInheitancedemo obj = new MultipleInheitancedemo();
        obj.display();
    }
}
