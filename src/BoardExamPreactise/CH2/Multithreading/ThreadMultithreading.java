package BoardExamPreactise.CH2.Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadMultithreading {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread's execution

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main: " + i);
        }
    }
}
