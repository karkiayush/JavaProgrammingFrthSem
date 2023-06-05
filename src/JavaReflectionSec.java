//Reflection API in the Java is the Feature where our Java Code can look at itself and examine and change any element of any java class at run time

import java.lang.reflect.Field;

public class JavaReflectionSec {
    public static void main(String[] args) throws Exception {
        Cat mycat = new Cat("Stella", 6);

        //to get the info about some objects class, we have to use .getClass()

        //it is the entry point for reflection
        Field[] catFields = mycat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            System.out.println(field.getName());


            field.setAccessible(true);

            if (field.getName().equals("name")) {
                field.set(mycat, "kitty");
            }
        }
        System.out.println(mycat.getName());
    }
}