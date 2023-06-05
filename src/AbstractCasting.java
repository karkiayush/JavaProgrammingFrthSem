//This is the src code of abstract type casting. If normally asked in exam, we don't need to write abstract
// keyword
class Janawar {
    void makeSound() {
        System.out.println("o/p of janawar method");
    }
}

class Cow extends Janawar {
    void makeSound() {
        System.out.println("Baaaah!!");
    }
}

public class AbstractCasting  {
    public static void main(String[] args) {
        // upcasting
        Janawar da = new Cow();// obj of Cow referred to Janawar.
        da.makeSound();//since the makeSound() method is overridden, so the string "Baah" will be printed on console

        // downcasting
        Cow gai = (Cow) da;
        gai.makeSound();

    }
}
