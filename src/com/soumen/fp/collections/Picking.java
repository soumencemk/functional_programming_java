package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class Picking {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        String startingLetter = "A";
        Optional<String> found = names.stream()
                .filter(name -> name.startsWith(startingLetter))
                .findFirst();
        System.out.println(String.format("A name startng with '%s' : %s ", startingLetter, found.orElse("No name found")));

    }
}
