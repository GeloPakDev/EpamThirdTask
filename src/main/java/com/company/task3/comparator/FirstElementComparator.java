package com.company.task3.comparator;

import com.company.task3.entity.CustomArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return Integer.compare(array1.getArray()[0], array2.getArray()[0]);
    }
}