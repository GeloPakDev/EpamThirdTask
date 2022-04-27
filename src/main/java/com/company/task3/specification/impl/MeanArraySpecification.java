package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MeanArraySpecification implements Specification {
    int mean;
    CustomArrayService service;

    public MeanArraySpecification(int mean) {
        this.mean = mean;
        service = new CustomArrayService();
    }

    @Override
    public boolean check(CustomArray array) {
        boolean i = false;
        try {
            if (mean > service.findMeanOfArray(array.getArray())) {
                i = true;
            }
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
        return i;
    }
}
