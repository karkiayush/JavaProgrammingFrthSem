//If we define the method of a class while making its instance,such class are Anonymous Inner Class
/*They are used when we have a single method in a class and if we wanna reuse that method for any other work,
        in such condition Anonymous Inner Class is used */
class A {
    public void show() {
        System.out.println("A");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            void display(){
                System.out.println("Hello we are displaying some content");
            }
            public void show() {
                System.out.println("Anonymous");
            }
        };
//        obj.display();
        obj.show();
    }
}

