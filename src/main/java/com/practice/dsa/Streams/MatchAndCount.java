package com.practice.dsa.Streams;

import java.util.List;

public class MatchAndCount {
    public static void main(String[] args) {
        List<String> strArr= List.of("Anish","Akash","Niraj");
        Long count = strArr.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Count of names"+ " "+ count);
    }
}
