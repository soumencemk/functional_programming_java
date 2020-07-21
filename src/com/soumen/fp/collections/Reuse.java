package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class Reuse {
    final static Predicate<String> startsWithS = name -> name.startsWith("S");

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        System.out.println("STARTS WITH S :: " + names.stream().filter(startsWithS).count());
    }
}
