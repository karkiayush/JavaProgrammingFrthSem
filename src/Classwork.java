class FirstClass {
    static void firstFun() {
        System.out.println("Output of first function");
    }

    void secondFun() {
        System.out.println("Output of second function");
    }
}

class SecondClass {
    void firstsFun() {
        System.out.println("Output of Second class first function");
    }

    void secondsFun() {
        System.out.println("Output of Second class second function");
    }
}

class ThirdClass {
    int firstFun() {
        System.out.println("Output of third class first function");
        return 0;
    }

    int secondFun() {
        System.out.println("Output of third class second function");
        return 0;
    }
}


//Driver class
public class Classwork {
    public static void main(String[] args) {
        System.out.println("Classwork task");

        FirstClass fc = new FirstClass();
        FirstClass.firstFun();
        fc.secondFun();

        SecondClass sc = new SecondClass();
        sc.firstsFun();
        sc.secondsFun();

        ThirdClass tc = new ThirdClass();
        FirstClass.firstFun();
        fc.secondFun();
    }
}
