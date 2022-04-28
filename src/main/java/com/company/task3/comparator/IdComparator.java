package com.company.task3.comparator;

import com.company.task3.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return Integer.compare(array1.getId(), array2.getId());
    }
}