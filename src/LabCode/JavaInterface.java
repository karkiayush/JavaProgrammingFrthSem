package LabCode;

interface Beit {
    void computerInterest();

    void computerKnowledge();

    void mathKnowledge();
}

interface CompEng {
    void computerInterest();
}

class Test implements Beit, CompEng {
    public void computerInterest() {
        System.out.println("Computer Interest in must needed things for CS student");
    }


    public void computerKnowledge() {
        System.out.println("Computer knowledge is vital");
    }

    public void mathKnowledge() {
    }

}

class JavaInterface {
    public static void main(String[] args) {
        Test t = new Test();
        t.computerInterest();
        t.computerKnowledge();
        t.mathKnowledge();
    }
}














