package DefaultMultipleInterfacesProba;

interface A{
    default void f(){
        System.out.println("A::f()");
    };
}

interface B{
    default void f(){
        System.out.println("B::f()");
    }
}

class C implements A, B{

    public void f() {
        System.out.println("C::f()");
        A.super.f();
        B.super.f();
        // System.out.println();
    }
}

public class Main {
    public static void main(String[] args){
        C c = new C();
        A a = new C();
        B b = new C();
        c.f();
        a.f();
        b.f();
    }
}
