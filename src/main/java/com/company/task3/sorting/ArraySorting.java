package com.company.task3.sorting;

public interface ArraySorting {
    void mergeSort(int[] array, int start, int end);

    void quickSort(int[] array, int start, int end);

    void countingSort(int[] array, int min, int max);
}
