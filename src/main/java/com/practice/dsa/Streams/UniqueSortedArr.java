package com.practice.dsa.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueSortedArr {
    public static void main(String[] args) {
        // Remove "Akash"
        // Remove duplicates
        // Sort alphabetically
        // Print each element
        List<String> strArr = List.of("Akash", "Amar","Rakesh","Sahil", "Amar");
//        strArr.stream()
//                .filter(name -> !name.equals("Akash"))
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        List<String> result = strArr.stream()
                .filter(name -> !name.equals("Akash"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Result Array"+ " "+ result);
    }
}
