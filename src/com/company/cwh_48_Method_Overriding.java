package com.company;


class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }

    public void show(){
        System.out.println("This is parents show");
    }
}


class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }

    public void meth3(){
        System.out.println("i am method 3 of class B");
    }

    public void show(){
        System.out.println("This is child's show");
    }
}
public class cwh_48_Method_Overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        b.show();

    }
}
