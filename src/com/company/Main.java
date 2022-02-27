package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Ala");
        names.add("Zuza");

        List<String> sortedList = getInDescOrder(names);

//        System.out.println("Original list");
//        names.forEach(s -> System.out.println(s));
//        System.out.println("Returned list");
        sortedList.forEach(s -> System.out.println(s));
    }

    private static List<String> getInDescOrder(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
//        return list.stream().sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
//        return list;
    }
}
