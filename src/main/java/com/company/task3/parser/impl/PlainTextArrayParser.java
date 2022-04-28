package com.company.task3.parser.impl;

import com.company.task3.parser.ArrayParser;

import java.util.List;

public class PlainTextArrayParser implements ArrayParser {
    public int[] parseData(List<String> list) {
        int length = list.size();
        int[] array = new int[length];
        for (int k = 0; k < length; k++) {
            int element = Integer.parseInt(list.get(k));
            array[k] = element;
        }
        return array;
    }
}