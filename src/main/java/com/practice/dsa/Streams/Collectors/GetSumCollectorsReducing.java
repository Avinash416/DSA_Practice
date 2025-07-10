package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class GetSumCollectorsReducing {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6);
        int sum = numList.stream().collect(Collectors.reducing(0,(a,b)-> a + b));
        System.out.println("Sum is:"+" "+ sum);
    }
}
