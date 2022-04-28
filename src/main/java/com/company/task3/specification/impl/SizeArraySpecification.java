package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class SizeArraySpecification implements Specification {

    private int from;
    private int to;

    public SizeArraySpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean check(CustomArray array) {
        CustomArrayService service = new CustomArrayService();
        int size = service.countElements(array.getArray());
        return from < size && to > size;
    }
}
