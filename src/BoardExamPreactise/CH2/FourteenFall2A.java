//Achieving run time polymorphism via method overriding . Solution of 14fall2a
package BoardExamPreactise.CH2;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

class Cow extends Animal {
    @Override
    void eat() {
        System.out.println("Cow is eating");
    }
}

public class FourteenFall2A {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Cow();

        animal1.eat(); // This will call the overridden method in Cat class
        animal2.eat(); // This will call the overridden method in Cow class
    }
}