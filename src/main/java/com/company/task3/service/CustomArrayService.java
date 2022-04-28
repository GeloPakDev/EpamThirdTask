package com.company.task3.service;

import java.util.Arrays;

public class CustomArrayService {
    public int findMeanOfArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public int findMaxElement(int[] array) {
        int length = array.length - 1;
        Arrays.sort(array);
        return array[length];
    }

    public int findMinElement(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int countElements(int[] array) {
        return array.length;
    }
}
