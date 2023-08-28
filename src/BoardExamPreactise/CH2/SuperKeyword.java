package BoardExamPreactise.CH2;

class AnimalSuper {
    int age = 33;

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogSuper extends AnimalSuper {
    @Override
    void sound() {
        super.sound(); // Call the sound() method of the superclass
        age = 44;
        System.out.println("Age is: " + super.age);
        System.out.println("Dog barks");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        DogSuper dog = new DogSuper();
        dog.sound();
    }
}
