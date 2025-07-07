package com.practice.dsa.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        //Make all the elements uppercase
        List<String> strArr = List.of("Akash","Aman","Ramu");
        List<String> result = strArr.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Result Arr"+ " "+ result);
    }
}
