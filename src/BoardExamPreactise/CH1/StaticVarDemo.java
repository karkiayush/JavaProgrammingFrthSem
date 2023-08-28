
public class StaticVarDemo {
    static int count; // This is a static variable

    public StaticVarDemo() {
        count++;
    }

    public static void main(String[] args) {
        StaticVarDemo obj1 = new StaticVarDemo();
        StaticVarDemo obj2 = new StaticVarDemo();

        System.out.println("Count: " + count); // Output: 2
        System.out.println("Count: " + StaticVarDemo.count); // Output: 2
    }
}