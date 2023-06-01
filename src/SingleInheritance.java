import java.util.Scanner;

class Engineering {
    Scanner sc = new Scanner(System.in);
    String name;
    String stream;
    int courseDuration;
    String level;

    void userInput() {
        System.out.println("What is you name ? ");
        name = sc.nextLine();
        System.out.println();

        System.out.println("Which engineering do you like the most ?");
        stream = sc.nextLine();

        System.out.println("what is the course duration of " + stream + "?");
        courseDuration = sc.nextInt();

        System.out.println("Provide your level of studies");
        level = sc.nextLine();
    }
}

class computerScienceEngineering extends Engineering {
    Scanner scan = new Scanner(System.in);
    String semester;
    int noOfSubjects;

    void cseMethod() {
        System.out.println("Provide the details of your semester, number of subject that you are studying");
        semester = scan.nextLine();
        noOfSubjects = scan.nextInt();
    }

    void displayInformation() {
        System.out.println(
                "Hello, it's me " + name + " who is " + level + " level student currently studying " + stream + " " +
                        "which is " + courseDuration + " years course and i'm in " + semester
                        + " semester where i've to study " + noOfSubjects +
                        " subjects in total");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        computerScienceEngineering cse = new computerScienceEngineering();
        System.out.println("We are implementing single inheritance in java");
        cse.userInput();
        cse.cseMethod();
        cse.displayInformation();
    }

}
