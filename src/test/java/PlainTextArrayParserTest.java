import com.company.task3.parser.impl.PlainTextArrayParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlainTextArrayParserTest {
    PlainTextArrayParser parser;

    @BeforeEach
    void setUp() {
        parser = new PlainTextArrayParser();
    }

    @Test
    void parseListWithCorrectData() {
        List<String> list = new ArrayList<>();
        list.add("1925");
        list.add("39512");
        list.add("589598");
        list.add("527");
        list.add("4893");
        int[] array = {1925, 39512, 589598, 527, 4893};
        int[] result = parser.parseData(list);
        assertArrayEquals(array, result);
    }
}