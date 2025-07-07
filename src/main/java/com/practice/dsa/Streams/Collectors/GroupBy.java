package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> nameList = List.of("Akash","Niraj","Nirbhay","Abhay");
        Map<Character, List<String>> nameMap = nameList.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Map Of names"+ " " +nameMap);
    }
}
