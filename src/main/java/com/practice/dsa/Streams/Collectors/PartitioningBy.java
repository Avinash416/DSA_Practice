package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    //Group even numbers from the list
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6,7,8);
        Map<Boolean, List<Integer>> numResult = numList.stream().collect(Collectors.partitioningBy(num -> num% 2 == 0));
        System.out.println("Grouped Even Numbers"+ " "+ numResult);
       // Grouped Even Numbers {false=[1, 3, 5, 7], true=[2, 4, 6, 8]}
    }
}
