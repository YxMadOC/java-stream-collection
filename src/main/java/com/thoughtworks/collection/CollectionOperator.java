package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int start = left < right ? left : right;
        int end = left != start ? left : right;
        List<Integer> result = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
        if (right > left) {
            return result;
        } else {
            Collections.reverse(result);
            return result;
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int start = left < right ? left : right;
        int end = left != start ? left : right;
        List<Integer> result = IntStream.rangeClosed(start, end).boxed().filter(item -> item % 2 == 0).collect(Collectors.toList());
        if (right > left) {
            return result;
        } else {
            Collections.reverse(result);
            return result;
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(item -> item % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).skip(array.length - 1).sum();
    }

//    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
//        throw new NotImplementedException();
//    }
//
//    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//        throw new NotImplementedException();
//    }
}
