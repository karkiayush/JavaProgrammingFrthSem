package BoardExamPreactise.CH1;
public class InstanceVariable {
    int y; // This is an instance variable

    public void setY(int value) {
        y = value;
    }

    public void printY() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();

        obj1.setY(5);
        obj2.setY(10);

        obj1.printY(); // Output: 5
        obj2.printY(); // Output: 10
    }
}
