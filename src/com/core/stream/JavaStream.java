package com.core.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by klash75 on 9/24/2015.
 */
public class JavaStream {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("Roshan");
        stringCollection.add("Dhiraj");
        stringCollection.add("Rani");
        stringCollection.add("Dilip");
        stringCollection.add("Ramesh");
        stringCollection.add("Vishal");
        stringCollection.add("Lil");

        //filtering
        stringCollection.stream().filter((s) -> s.startsWith("R")).forEach(System.out::println);

        //sorting
        stringCollection.stream().sorted().filter((s) -> s.startsWith("R")).forEach(System.out::println);

        //mapping
        stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

        //matching
        boolean anyStartsWithR = stringCollection.stream().anyMatch((s) -> s.startsWith("R"));
        System.out.print(anyStartsWithR);

        //counting
        long startsWithR = stringCollection.stream().filter((s) -> s.startsWith("R")).count();
        System.out.println(startsWithR);

        //reducing
        Optional<String> reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
    }
}
