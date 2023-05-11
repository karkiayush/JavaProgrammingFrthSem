//Parent class
class Animal {
    void animalProp() {
        System.out.println("Animals include  sponges, worms, insects, fish, amphibians, reptiles, birds, and mammals");
    }
}

//Child class
class Mammals extends Animal {
    void mammalProp() {
        System.out.println("Mammals is derived from animal category");
    }
}

//Child class of Mammals
class Kangaroo extends Mammals {
    void kangarooProp() {
        System.out.println("Kangaroo are famous in Australia");
    }
}

//Driver class
public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("Demo of multilevel Inheritance");
        Kangaroo kg = new Kangaroo();
        kg.animalProp();
        kg.mammalProp();
        kg.kangarooProp();
    }
}
