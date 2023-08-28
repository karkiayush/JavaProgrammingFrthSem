package BoardExamPreactise.CH2;

class Person {
    String name;
    int age;

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name parameter
    Person(String name) {
        this(name, 0); // Calls the first constructor with age set to 0
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.displayInfo(); // Output: Name: Alice, Age: 30

        Person person2 = new Person("Bob");
        person2.displayInfo(); // Output: Name: Bob, Age: 0
    }
}
