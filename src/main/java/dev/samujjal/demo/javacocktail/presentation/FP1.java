package dev.samujjal.demo.javacocktail.presentation;

import java.util.List;

public class FP1 {
    public static void main(String[] args) {

    }

    //imperative style

    private static boolean findString(String value, List<String> strings){
        for (String str :
                strings) {
            if(str.equals(value))
                return true;
        }
        return false;
    }

    //declarative style

    private static boolean findStringDeclarative(String value, List<String> strings){
        return strings.contains(value);
    }
}
