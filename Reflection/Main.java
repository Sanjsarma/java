package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException, SecurityException, NoSuchFieldException {
        // reflection of class.
        Class birdClass = Bird.class;
        System.out.println(birdClass.getName());
        System.out.println(birdClass.getModifiers());

        // reflection of method
        Method[] method = birdClass.getMethods();
        for (Method meth : method) {
            System.out.println(meth.getName());
            System.out.println(meth.getReturnType());

        }

        // to get only declared class's methods.
        Method[] declaredMeth = birdClass.getDeclaredMethods();
        for (Method meth : declaredMeth) {
            System.out.println(meth.getName());
        }

        // Class eagleClass = Class.forName("Eagle");
        // Object eagleObj = eagleClass.newInstance();

        // Method flyMeth = eagleClass.getMethod("fly", int.class, boolean.class,
        // String.class);
        // flyMeth.invoke(eagleObj, 10, true, "Hello");

        // setting value of public field
        Class<Eagle> eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();
        Field field = eagleClass.getDeclaredField("breed");
        field.set(eagleObj, "canBreed");
        System.out.println(eagleObj.breed);
    
       // setting value of private field
        Class<Eagle> eagleClass2 = Eagle.class;
        Eagle eagleObj2 = new Eagle();
        Field field2 = eagleClass2.getDeclaredField("canSwim");
        field2.setAccessible(true);
        field2.set(eagleObj2, true);
        if (field2.getBoolean(eagleObj2)) {
             System.out.println("value is set to true");
        }

        // private constructor
        Class eaglePr = EaglePrivateCons.class;
        Constructor[] eagleConstructorList = eaglePr.getDeclaredConstructors();
        for (Constructor constructor : eagleConstructorList) {
            System.out.println(Modifier.toString(constructor.getModifiers()));

            constructor.setAccessible(true);
            EaglePrivateCons obj = (EaglePrivateCons) constructor.newInstance();
            obj.fly();
        }
    }
}
