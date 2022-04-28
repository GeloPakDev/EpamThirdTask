package com.company.task3.entity;

import java.util.StringJoiner;

public class ArrayValues {
    private int min;
    private int max;
    private int average;
    private int sum;

    public ArrayValues(int min, int max, int average, int sum) {
        this.min = min;
        this.max = max;
        this.average = average;
        this.sum = sum;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayValues that = (ArrayValues) o;

        if (min != that.min) return false;
        if (max != that.max) return false;
        if (average != that.average) return false;
        return sum == that.sum;
    }

    @Override
    public int hashCode() {
        int result = min;
        result = 31 * result + max;
        result = 31 * result + average;
        result = 31 * result + sum;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayValues.class.getSimpleName() + "[", "]")
                .add("min=" + min)
                .add("max=" + max)
                .add("average=" + average)
                .add("sum=" + sum)
                .toString();
    }
}
