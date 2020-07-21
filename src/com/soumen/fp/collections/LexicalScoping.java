package com.soumen.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Soumen Karmakar
 * 21/07/2020
 */
public class LexicalScoping {

    final static Predicate<String> checkIfStartsWith(final String letter) {return name -> name.startsWith(letter);}

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Soumen", "Madhumita", "Soumita");
        System.out.println("STARTS WITH S :: " + names.stream().filter(checkIfStartsWith("S")).count());
        System.out.println("STARTS WITH M :: " + names.stream().filter(checkIfStartsWith("M")).count());
    }
}
