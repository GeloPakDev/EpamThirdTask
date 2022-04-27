package com.company.task3.repository.impl;

import com.company.task3.entity.CustomArray;
import com.company.task3.repository.Repository;
import com.company.task3.specification.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CustomArrayRepository implements Repository {

    private List<CustomArray> repository;

    public CustomArrayRepository() {
        repository = new ArrayList<>();
    }

    public List<CustomArray> getRepository() {
        return repository;
    }

    public void setRepository(List<CustomArray> repository) {
        this.repository = repository;
    }

    @Override
    public void add(CustomArray array) {
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

    public List<CustomArray> findBySpecification(Specification specification) {
        List<CustomArray> list = new ArrayList<>();
        for (CustomArray array : repository) {
            if (specification.check(array)) {
                list.add(array);
            }
        }
        return list;
    }
}
