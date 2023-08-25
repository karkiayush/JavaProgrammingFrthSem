package BoardExamPreactise.CH2;

import java.lang.reflect.Field;

public class ReflectionTutorial {
    public static void main(String[] args) {
        Cat myCat = new Cat("Stella", 6);
        /*
         * when we are trying to get information about some objects class, use
         * obj.getClass method. getClassMethod returns the array of field hence we are
         * storing in field type array
         */
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            // System.out.println(field.getName());

            // if (field.getName().equals("name")) {
            // field.set(myCat, "Jimmy McGill");
            // }
        }

    }
}
