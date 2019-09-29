package dev.samujjal.demo.javacocktail.presentation;

import java.util.*;

public class FP1Closure {
    public void publicMethod(){
        Integer i1 = 12;
        Integer i2 = 12;
        Integer i3 = 12;

        Map<String, Integer> map = new HashMap<String, Integer>(){
            {
                put("a", i1);
                put("b", i2);
                put("c", i3);
            }
        };

        Thread T1 = new Thread(() -> System.out.println(i1));

        List<String> stringList = Arrays.asList("Sam", "Dam", "Bam");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
