package com.company.task3.comparator;

import com.company.task3.entity.CustomArray;

import java.util.Comparator;

public class LastElementComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return Integer.compare(array1.getArray()[array1.getArray().length], array2.getArray()[array2.getArray().length]);
    }
}
