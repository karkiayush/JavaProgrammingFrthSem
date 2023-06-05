package LabCode;

import java.lang.reflect.Method;


//Driver code
public class JavaReflection {

    public static void main(String[] args) throws Exception {

        //someMethod is referred to method object
        Method method = TempReflection.class.getDeclaredMethod("someMethod");

        //since the someMethod() is private, so we need to make is accessible
        method.setAccessible(true);
        /*invoke takes object and the parameters of the method which is going to be invoked.
        But being static method, there won't be any obj and since no parameter is passed, so second thing is not provided */
        method.invoke(null);
    }
}