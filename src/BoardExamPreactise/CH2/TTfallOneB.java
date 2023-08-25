package BoardExamPreactise.CH2;

import java.lang.reflect.Method;

class MyClass {
    private void privateMethod() {
        System.out.println("It is a private method");
    }
}

public class TTfallOneB {
    public static void main(String[] args) {
        // object of class
        MyClass mc = new MyClass();
        try {
            // obtaining the object of the class in c1
            Class<?> c1 = mc.getClass();

            Method m1 = c1.getDeclaredMethod("privateMethod");
            m1.setAccessible(true);

            // invoking the private method
            m1.invoke(mc);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
