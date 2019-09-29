package dev.samujjal.demo.javacocktail.presentation;

import java.util.Arrays;
import java.util.List;

public class FP3MethodRef {
    public void printLowerCase(String s) {
        System.out.println(s.toLowerCase());
    }
    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
    public void publicMethod() {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(this::printLowerCase);
        list.forEach(FP3MethodRef::printUpperCase);
        list.forEach(String::toLowerCase);
        list.forEach(String::new);
    }
}
