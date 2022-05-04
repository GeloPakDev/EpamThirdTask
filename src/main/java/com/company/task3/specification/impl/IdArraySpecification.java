package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.specification.Specification;

public class IdArraySpecification implements Specification {
    private int id;

    public IdArraySpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getId() == id;
    }
}
