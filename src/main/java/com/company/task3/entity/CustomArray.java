package com.company.task3.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {
    int id;
    int[] array;

    public CustomArray(int id, int[] array) {
        this.id = id;
        this.array = array;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (id != that.id) return false;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
