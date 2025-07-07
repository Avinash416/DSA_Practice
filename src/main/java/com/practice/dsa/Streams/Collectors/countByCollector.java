package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class countByCollector {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5);
        Long num = numList.stream().collect(Collectors.counting());
        System.out.println(num);
    }
}
