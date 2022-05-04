package com.company.task3.service;

import com.company.task3.entity.CustomArray;

import java.util.Arrays;

public class CustomArrayService {
    public int findMeanOfArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public int findMaxElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        int length = array.length - 1;
        Arrays.sort(array);
        return array[length];
    }

    public int findMinElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        Arrays.sort(array);
        return array[0];
    }

    public int sumOfArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int countElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        return array.length;
    }
}
