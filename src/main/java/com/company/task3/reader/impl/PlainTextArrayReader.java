package com.company.task3.reader.impl;

import com.company.task3.exception.CustomArrayException;
import com.company.task3.reader.ArrayReader;
import com.company.task3.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class PlainTextArrayReader implements ArrayReader {

    private static final String REGEX_SPLITTER = "\\s+";
    private static final Logger LOGGER = LogManager.getLogger(PlainTextArrayReader.class);

    public List<String> readData(String path) throws CustomArrayException {
        if (path == null) {
            throw new CustomArrayException("File path is null!");
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new CustomArrayException("File is not exists!");
        }
        List<String> list;
        ArrayValidator arrayValidator = new ArrayValidator();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream.flatMap(line -> Stream.of(line.split(REGEX_SPLITTER)))
                    .peek(LOGGER::info)
                    .filter(arrayValidator::checkNumberCorrectness)
                    .toList();
            LOGGER.info("Validating the list completed");
        } catch (IOException e) {
            LOGGER.error("File is not found!", e);
            throw new CustomArrayException("File is not found!", e);
        }
        LOGGER.info("File successfully read from the file: " + path);
        return list;
    }
}