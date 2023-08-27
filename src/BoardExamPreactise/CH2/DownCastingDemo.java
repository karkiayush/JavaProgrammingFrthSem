package BoardExamPreactise.CH2;

abstract class Animal {

    abstract void makeSound();
}

class kukkur extends Animal {

    void makeSound() {
        System.out.println("Woof woof!");
    }
}

class biralo extends Animal {

    void makeSound() {

        System.out.println("Meow meow!");

    }
}

public class DownCastingDemo {

    public static void main(String[] args) {

        Animal myDog = new kukkur();

        Animal myCat = new biralo();

        if (myDog instanceof kukkur) {

            kukkur dogInstance = (kukkur) myDog; // Downcasting
            dogInstance.makeSound(); // Outputs "Woof woof!"
        }

        if (myCat instanceof biralo) {

            biralo catInstance = (biralo) myCat; // Downcasting
            catInstance.makeSound(); // Outputs "Meow meow!"
        }

    }

}
