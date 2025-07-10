package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConcatinateNames {
    public static void main(String[] args) {
        List<String> names = List.of("Avinash", "Ravi", "John");
       Optional<String> joinedNames =names.stream().collect(Collectors.reducing((s1, s2)-> s1 + "|" + s2));
        System.out.println(joinedNames);
        //Optional[Avinash|Ravi|John]
    }
}
