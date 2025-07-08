package com.practice.dsa.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfLengthsOfWords {
    public static void main(String[] args) {
        List<String> nameList = List.of("Akash","Abhi","Niraj","Ashok");
       int sum = nameList.stream().collect(Collectors.summingInt(String::length));
        System.out.println("Sum of names length:"+" "+ sum);
       // Sum of names length: 19
    }
}
