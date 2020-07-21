package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class Reducing {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        int sum = names.stream()
                .mapToInt(name -> name.length())
                .sum();
        System.out.println("Total number of characters in all names : " + sum);
        System.out.println("Longest name : " + findLogest(names));

    }

    private static String findLogest(List<String> names) {
        Optional<String> aLongName = names.stream()
                .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);
        return aLongName.orElse("NOT FOUND");
    }
}
