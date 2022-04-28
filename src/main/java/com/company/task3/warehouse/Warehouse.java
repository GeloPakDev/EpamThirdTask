package com.company.task3.warehouse;

import com.company.task3.entity.ArrayValues;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Warehouse warehouse = new Warehouse();
    private Map<Integer, ArrayValues> arrayValuesMap = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return warehouse;
    }

    public ArrayValues get(Integer key) {
        return arrayValuesMap.get(key);
    }

    public void put(Integer key, ArrayValues value) {
        arrayValuesMap.put(key, value);
    }

    public void putAll(Map<? extends Integer, ? extends ArrayValues> m) {
        arrayValuesMap.putAll(m);
    }

    public boolean remove(Integer key, ArrayValues value) {
        return arrayValuesMap.remove(key, value);
    }
}
