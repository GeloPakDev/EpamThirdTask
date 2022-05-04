package com.company.task3.specification.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.service.CustomArrayService;
import com.company.task3.specification.Specification;

public class MeanArraySpecification implements Specification {
    private int from;
    private int to;

    public MeanArraySpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(CustomArray array) {
        CustomArrayService service = new CustomArrayService();
        int mean = service.findMeanOfArray(array);
        return from < mean && to > mean;
    }
}
