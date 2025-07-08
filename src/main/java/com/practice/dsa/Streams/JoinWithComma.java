package com.practice.dsa.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class JoinWithComma {
    public static void main(String[] args) {
        List<String> names = List.of("Avinash", "Ravi", "John");
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println(result);
//      op:  Avinash, Ravi, John
    }
}
