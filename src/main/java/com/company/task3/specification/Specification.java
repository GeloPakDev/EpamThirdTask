package com.company.task3.specification;

import com.company.task3.entity.CustomArray;

@FunctionalInterface
public interface Specification {
    boolean specify(CustomArray array);
}