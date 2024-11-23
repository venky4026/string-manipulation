package com.string.app.innerclass;

public class OuterClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing an interface
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class");
            }
        };
        r.run();

        // Anonymous inner class extending a class
        class MyClass {}
        MyClass o = new MyClass() {
            @Override
            public String toString() {
                return "Anonymous inner class";
            }
        };
        System.out.println(o.toString());
    }
}
