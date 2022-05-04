package com.company.task3.reader;

import com.company.task3.exception.CustomArrayException;

import java.util.List;

public interface ArrayReader {
    List<String> readData(String path) throws CustomArrayException;
}

