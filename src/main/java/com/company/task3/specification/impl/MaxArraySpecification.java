package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MaxArraySpecification implements Specification {
    private int from;
    private int to;

    public MaxArraySpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomArrayService service = new CustomArrayService();
        int maxElement = service.findMaxElement(array);
        return from < maxElement && to > maxElement;
    }
}