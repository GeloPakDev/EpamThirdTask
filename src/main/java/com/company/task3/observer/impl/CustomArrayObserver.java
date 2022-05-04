package com.company.task3.observer.impl;

import com.company.task3.entity.ArrayValues;
import com.company.task3.entity.CustomArray;
import com.company.task3.observer.ArrayObserver;
import com.company.task3.service.CustomArrayService;
import com.company.task3.warehouse.Warehouse;

public class CustomArrayObserver implements ArrayObserver {
    @Override
    public void actionPerformed(CustomArray array) {
        CustomArrayService service = new CustomArrayService();
        int id = array.getId();
        int min = service.findMinElement(array);
        int max = service.findMaxElement(array);
        int average = service.findMeanOfArray(array);
        int sum = service.sumOfArray(array);
        ArrayValues arrayValues = new ArrayValues(min, max, average, sum);
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, arrayValues);
    }
}
