package com.practice.dsa.Streams;

import java.util.List;
import java.util.Optional;

public class FindFirstOrFindAny {
    public static void main(String[] args) {
        List<String> strArr =List.of("Akash","Abhay","Nirbhay");
//        Optional<String> resultName=strArr.stream().filter(name -> name.startsWith("A")).findFirst();
        Optional<String> resultName=strArr.stream().filter(name -> name.startsWith("A")).findAny();
        resultName.ifPresent(System.out::println);
    }
}
