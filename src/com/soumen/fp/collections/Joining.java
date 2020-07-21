package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class Joining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        String collect = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
