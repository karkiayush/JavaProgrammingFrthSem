package BoardExamPreactise.CH3.FileHandling;

import java.io.*;

class Student implements Serializable {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

/**
 * SevenTeenFallThreeA
 */
public class SevenTeenFallThreeA {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        // Saving students to file
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
            outputStream.writeObject(student1);
            outputStream.writeObject(student2);
            System.out.println("Students data saved to student.dat");
        } catch (IOException e) {
            System.out.println("An error occurred while saving: " + e.getMessage());
        }

        // Reading students from file and displaying
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.dat"));
            System.out.println("Loaded Students:");
            System.out.println(inputStream.readObject());
            System.out.println(inputStream.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }

}
