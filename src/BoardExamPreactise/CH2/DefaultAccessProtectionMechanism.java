package BoardExamPreactise.CH2;

class parent {
    int age = 22;

    void showAge() {
        System.out.println("Age is: " + age);
    }

    parent() {
        System.out.println("Parent consturctor");
    }

    class innerClass {
        void innerDisplay() {
            System.out.println(age);
        }
    }
}

class child extends parent {
    void display() {
        System.out.println(age);
    }
}

public class DefaultAccessProtectionMechanism {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
