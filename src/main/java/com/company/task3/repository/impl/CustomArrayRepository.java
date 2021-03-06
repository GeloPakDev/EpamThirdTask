package com.company.task3.repository.impl;

import com.company.task3.warehouse.Warehouse;
import com.company.task3.entity.ArrayValues;
import com.company.task3.entity.CustomArray;
import com.company.task3.repository.Repository;
import com.company.task3.service.CustomArrayService;
import com.company.task3.sorting.SortingService;
import com.company.task3.specification.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CustomArrayRepository implements Repository {
    private static final CustomArrayRepository instance = new CustomArrayRepository();
    private List<CustomArray> repository = new ArrayList<>();

    private CustomArrayRepository() {
    }

    public static CustomArrayRepository getInstance() {
        return instance;
    }

    public List<CustomArray> getRepository() {
        return repository;
    }

    public void setRepository(List<CustomArray> repository) {
        this.repository = repository;
    }

    @Override
    public void add(CustomArray array) {
        addToWarehouse(array);
        repository.add(array);
    }

    @Override
    public void remove(int id) {
        repository.removeIf(array -> array.getId() == id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayRepository that = (CustomArrayRepository) o;

        return repository != null ? repository.equals(that.repository) : that.repository == null;
    }

    @Override
    public int hashCode() {
        return repository != null ? repository.hashCode() : 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArrayRepository.class.getSimpleName() + "[", "]")
                .add("storage=" + repository)
                .toString();
    }

    @Override
    public List<CustomArray> query(Specification specification) {
        List<CustomArray> list = new ArrayList<>();
        for (CustomArray array : repository) {
            if (specification.specify(array)) {
                list.add(array);
            }
        }
        return list;
    }

    @Override
    public void sort(SortingService service) {
        service.sorting(repository);
    }

    private void addToWarehouse(CustomArray array) {
        Warehouse warehouse = Warehouse.getInstance();
        CustomArrayService service = new CustomArrayService();
        int min = service.findMinElement(array);
        int max = service.findMaxElement(array);
        int average = service.findMeanOfArray(array);
        int sum = service.sumOfArray(array);
        ArrayValues arrayValues = new ArrayValues(min, max, average, sum);
        warehouse.put(array.getId(), arrayValues);
    }
}