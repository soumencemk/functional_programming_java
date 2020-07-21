package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class Iteration {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        // Iterating
        names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);
        //Transforming
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
        //finding elements
        names
                .stream()
                .filter(n -> n.startsWith("S"))
                .forEach(System.out::println);

    }
}
