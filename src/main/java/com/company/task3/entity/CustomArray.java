package com.company.task3.entity;

import com.company.task3.exception.CustomArrayException;
import com.company.task3.observer.ArrayObserver;
import com.company.task3.observer.Observable;
import com.company.task3.observer.impl.CustomArrayObserver;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray implements Observable {
    private int id;
    private int[] array;
    private ArrayObserver observer = new CustomArrayObserver();

    public CustomArray(int id, int[] array) {
        this.id = id;
        this.array = array;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws CustomArrayException {
        if (id < 0) {
            throw new CustomArrayException("Id cannot be negative");
        }
        this.id = id;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObservers();
    }

    public int getElement(int index) throws CustomArrayException {
        if (index > array.length || index < 0) {
            throw new CustomArrayException("Unable to get the element!");
        }
        return array[index];
    }

    public void setElement(int index, int element) throws CustomArrayException {
        if (index > array.length || index < 0) {
            throw new CustomArrayException("Unable to set up the element");
        }
        array[index] = element;
        notifyObservers();
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

    @Override
    public void attach(ArrayObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach(ArrayObserver observer) {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        observer.actionPerformed(this);
    }
}
