package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class SizeArraySpecification implements Specification {

    int size;
    CustomArrayService service;

    public SizeArraySpecification(int size) {
        this.size = size;
        service = new CustomArrayService();
    }

    @Override
    public boolean check(CustomArray array) {
        return size == service.countElements(array.getArray());
    }
}
