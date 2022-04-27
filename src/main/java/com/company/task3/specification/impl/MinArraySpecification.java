package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MinArraySpecification implements Specification {
    int min;
    CustomArrayService service;

    public MinArraySpecification(int min) {
        this.min = min;
        service = new CustomArrayService();
    }

    @Override
    public boolean check(CustomArray array) {
        boolean i = false;
        try {
            if (this.min > service.findMinElement(array.getArray())) {
                i = true;
            }
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
        return i;
    }
}
