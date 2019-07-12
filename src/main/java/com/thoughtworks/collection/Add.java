package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start = leftBorder < rightBorder ? leftBorder : rightBorder;
        int end = leftBorder != start ? leftBorder : rightBorder;
        return IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()).stream().filter(item -> item % 2 == 0).mapToInt(i -> i).sum();
    }

//    public int getSumOfOdds(int leftBorder, int rightBorder) {
//        return IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()).stream().filter(item -> item % 2 == 0).mapToInt(i -> i).sum();
//    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(item -> item * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> {
            if (item % 2 != 0) {
                return item * 3 + 2;
            }
            return item;
        }).collect(Collectors.toList());
    }

//    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).mapToInt(i -> i).average().orElse(0);
    }

//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().distinct().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
