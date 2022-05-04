package com.company.task3.sorting.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.sorting.SortingService;

import java.util.List;

public class CountingSorting implements SortingService {

    @Override
    public void sorting(List<CustomArray> list) {
        CustomArraySorting sorting = new CustomArraySorting();
        for (CustomArray customArray : list) {
            sorting.countingSort(customArray.getArray(), 0, customArray.getArray().length);
        }
    }
}

