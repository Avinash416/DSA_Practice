package com.practice.dsa.Streams.Collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5);
        IntSummaryStatistics stats = numList.stream().collect(Collectors.summarizingInt(num -> num));
        System.out.println("Stats"+ " "+ stats);
        //op:Stats IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
    }
}
