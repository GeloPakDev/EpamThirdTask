package com.company.task3.repository;

import com.company.task3.entity.CustomArray;
import com.company.task3.sorting.SortingService;
import com.company.task3.specification.Specification;

import java.util.List;

public interface Repository {
    void add(CustomArray array);

    void remove(int id);

    List<CustomArray> query(Specification specification);

    void sort(SortingService service);
}
