package AnnotationDemo;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main (String[] arg) throws Exception {

//        T t = new T("ceva");
//        System.out.println(t.getClass().getName());

        Class cls = null;
        cls = Class.forName("AnnotationDemo.T");
        Copyright cr = (Copyright) cls.getAnnotation( Copyright.class ) ;
        System.out.println(cr.author());
        System.out.println(cr.year());

        Constructor c = cls.getConstructor(String.class);
        Object clsi = c.newInstance("aaa");

        //Object clsi = cls.newInstance();

        //for (Method m : cls.getMethods())
        Method m = cls.getMethod("f");
        m.invoke(clsi);

        m = cls.getDeclaredMethod("f", String.class);
        m.setAccessible(true);

        m.invoke(clsi, "10");

        Field f = cls.getDeclaredField("x");
        f.setAccessible(true);
        System.out.println(f.get(clsi));

    }

}
