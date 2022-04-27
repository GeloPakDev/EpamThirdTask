package com.company.task3.service;

import com.company.task3.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArrayService {
    public int findMeanOfArray(int[] array) throws CustomArrayException {
        if (array == null) {
            throw new CustomArrayException("Array can not be null");
        }
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public int findMaxElement(int[] array) throws CustomArrayException {
        if (array == null) {
            throw new CustomArrayException("Array can not be null");
        }
        int length = array.length - 1;
        Arrays.sort(array);
        return array[length];
    }

    public int findMinElement(int[] array) throws CustomArrayException {
        if (array == null) {
            throw new CustomArrayException("Array can not be null");
        }
        Arrays.sort(array);
        return array[0];
    }

    public int countElements(int[] array) {
        return array.length;
    }
}
