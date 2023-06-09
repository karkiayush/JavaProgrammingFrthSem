package QuestionBank.TwentyTwoFall;
//Write a java program that does the reflective operation of accessing a private method of class

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*Process of using Java Reflection

1. OBTAINING CLASS OBJECTS:
    => To begin with reflection, you need to obtain a Class object, which represents a class at runtime. There are three common ways to obtain a Class object:

        (i).Using the .class syntax: For example, Class<MyClass> clazz = MyClass.class;

        (ii)Using the getClass() method: For example, MyClass obj = new MyClass(); Class<? extends MyClass> clazz = obj.getClass();

        (iii)Using the getClass() method: For example, MyClass obj = new MyClass(); Class<? extends MyClass> clazz = obj.getClass();


2. ACCESSING CLASS MEMBERS:
    =>  Once you have a Class object, you can access various class members such as fields, methods, and constructors.

        (i)Fields:
            To access fields, you can use the getField() method to get public fields or the getDeclaredField() method to get any field regardless of its accessibility. Example:
            
            Field publicField = clazz.getField("fieldName");
            Field privateField = clazz.getDeclaredField("fieldName");

        (ii)Methods:
            To access methods, you can use the getMethod() method to get public methods or the getDeclaredMethod() method to get any method regardless of its accessibility. Example:

            Method publicMethod = clazz.getMethod("methodName", parameterTypes);
            Method privateMethod = clazz.getDeclaredMethod("methodName", parameterTypes);


        (iii)Constructors:
            To access constructors, you can use the getConstructor() method to get public constructors or the getDeclaredConstructor() method to get any constructor regardless of its accessibility. Example:

            Constructor<MyClass> publicConstructor = clazz.getConstructor(parameterTypes);
            Constructor<MyClass> privateConstructor = clazz.getDeclaredConstructor(parameterTypes);       
            
        
        (iv)Modifying Access Levels:
            By default, reflection only allows you to access public members. To access or modify private or protected members, you need to set the Accessible flag to true. Example:

            Field field = clazz.getDeclaredField("fieldName");
            field.setAccessible(true); // Allows access to private field


        (v)Invoking Methods:
            You can dynamically invoke methods using the invoke() method. Example:


            Method method = clazz.getDeclaredMethod("methodName", parameterTypes);
            method.setAccessible(true);
            Object result = method.invoke(objectInstance, arguments);(v)Invoking Methods:
            You can dynamically invoke methods using the invoke() method. Example:


            Method method = clazz.getDeclaredMethod("methodName", parameterTypes);
            method.setAccessible(true);
            Object result = method.invoke(objectInstance, arguments);
            
            
        (v)Retrieving Annotations:
            You can obtain annotations associated with classes, fields, methods, or constructors using the getAnnotations() method. Example:

            Annotation[] annotations = clazz.getAnnotations();


Remember to handle exceptions appropriately, as reflection operations can throw NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, and other exceptions.
*/

class MyClass {
    private void privateMethod() {
        System.out.println("This is a private methods");
    }
}

// Driver code
public class OneB {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        try {
            // Lets obtain the class object
            Class<?> class1 = obj.getClass();
            // Accessing the private methods
            Method privateMethod = class1.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true);
            privateMethod.invoke(obj);
        }

        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
