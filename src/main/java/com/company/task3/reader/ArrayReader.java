package com.company.task3.reader;

import com.company.task3.exception.FileException;

import java.util.List;

public interface ArrayReader {
    List<String> readData(String path) throws FileException;
}

