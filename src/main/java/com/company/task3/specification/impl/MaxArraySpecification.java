package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MaxArraySpecification implements Specification {
    int max;
    CustomArrayService service;

    public MaxArraySpecification(int max) {
        this.max = max;
        service = new CustomArrayService();
    }

    @Override
    public boolean check(CustomArray array) {
        boolean i = false;
        try {
            if (max < service.findMaxElement(array.getArray())) {
                i = true;
            }
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
        return i;
    }
}
