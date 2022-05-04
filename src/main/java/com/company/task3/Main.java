package com.company.task3;

import com.company.task3.creator.CustomArrayCreator;
import com.company.task3.entity.CustomArray;
import com.company.task3.repository.impl.CustomArrayRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        CustomArrayCreator creator = new CustomArrayCreator();
        creator.createCustomArrayWithValues(1, array);
        CustomArrayRepository repository = CustomArrayRepository.getInstance();
        System.out.println(repository);

    }
}

