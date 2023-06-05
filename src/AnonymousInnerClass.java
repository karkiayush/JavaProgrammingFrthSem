//If we define the method of a class while making its instance,such class are Anonymous Inner Class
/*They are used when we have a single method in a class and if we want to reuse that method for any other work,
        in such condition Anonymous Inner Class is used */
class AB {
    public void show() {
        System.out.println("A");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AB obj = new AB() {
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

