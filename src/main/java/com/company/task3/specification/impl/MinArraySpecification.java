package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MinArraySpecification implements Specification {
    private int from;
    private int to;

    public MinArraySpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean check(CustomArray array) {
        CustomArrayService service = new CustomArrayService();
        int min = service.findMinElement(array.getArray());
        return from < min && to > min;
    }
}
