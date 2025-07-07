package com.practice.dsa.Streams;

import java.util.List;

public class SumOfAllNum {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5);
        Integer result = numList.stream().reduce(0,(a,b)-> a + b);
        System.out.println("Sum is"+ " "+ result);
    }
}
