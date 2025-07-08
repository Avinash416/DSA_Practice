package com.practice.dsa.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWords {
    public static void main(String[] args) {
        List<String> fruitsList = List.of("Orange","Mango","Banana","Orange","Mango");
        Map<String, Long> fruitsMap= fruitsList.stream().collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));
        System.out.println("Result Fruit List"+" "+fruitsMap);
        //Result Fruit List {Mango=2, Orange=2, Banana=1}
    }
}
