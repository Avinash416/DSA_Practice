package com.practice.dsa.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3NumWithdoublingValue {
//    Get Top 3 Highest Numbers After Doubling the Even Numbers
//🧠 Input:List.of(3, 2, 8, 5, 10, 7)
// Output: // [20, 16, 4]

    public static void main(String[] args) {
        List<Integer> numList = List.of(3, 2, 8, 5, 10, 7);
        List<Integer> resultList = numList.stream().filter(num -> num % 2 == 0)
                                                   .map(num -> num * 2)
                                                   .sorted(Comparator.reverseOrder())
                                                   .limit(3)
                                                   .collect(Collectors.toList());
        System.out.println("Result Value"+" "+ resultList);
    }
}
