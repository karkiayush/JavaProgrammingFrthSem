//This is the src code of abstract type casting. If normally asked in exam, we don't need to write abstract
// keyword

abstract class Janawar{
    abstract void makeSound();
}

public class AbstractCasting extends Janawar{
    void makeSound(){
        System.out.println("Baaaah!!");
    }
}

