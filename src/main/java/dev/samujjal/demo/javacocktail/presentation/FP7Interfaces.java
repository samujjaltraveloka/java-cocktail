package dev.samujjal.demo.javacocktail.presentation;

public class FP7Interfaces {
    interface A{
        default void haveFun(){
            System.out.println("Having Fun");
        }
    }

    interface B {
        default void haveFun(){
            System.out.println("No Fun");
        }
    }

    public void fun(){
        class AB implements A{

        }
    }


}
