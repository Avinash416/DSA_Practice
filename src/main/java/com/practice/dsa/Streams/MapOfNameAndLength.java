package com.practice.dsa.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfNameAndLength {
    public static void main(String[] args) {
        List<String> nameList = List.of("Akash","Amar","Rakesh");
        Map<String, Integer> nameMap =nameList.stream().collect(Collectors.toMap(name ->name, name->name.length()));
        System.out.println("Name Map with length Count"+" "+ nameMap);
        //o/p: Name Map with length Count {Amar=4, Rakesh=6, Akash=5}
    }
}
