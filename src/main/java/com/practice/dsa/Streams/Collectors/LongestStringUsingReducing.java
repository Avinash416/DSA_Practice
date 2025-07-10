package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestStringUsingReducing {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Collectors", "Stream", "API");
       Optional<String> result =words.stream().collect(Collectors.reducing((s1, s2)-> s1.length() > s2.length()? s1 : s2));
        System.out.println("Longest String:"+" "+ result);
        //Longest String: Optional[Collectors]
    }
}
