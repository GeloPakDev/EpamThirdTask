import com.company.task3.creator.CustomArrayCreator;
import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.parser.impl.PlainTextArrayParser;
import com.company.task3.reader.impl.PlainTextArrayReader;
import com.company.task3.repository.Repository;
import com.company.task3.repository.impl.CustomArrayRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CustomArrayCreatorTest {

    PlainTextArrayReader reader;
    PlainTextArrayParser parser;
    CustomArrayCreator creator;
    private static final Logger LOGGER = LogManager.getLogger(CustomArrayCreatorTest.class);
    private static final String PATH = "C:\\Users\\super\\Desktop\\GELO\\Computer Science\\numbers.txt";
    private static final int[] correctArray = {44, 982, 347, 823, 18, 573, 35, 27, 2390, 391, 82, 984, 721, 72, 842, 837, 52, 4959, 93, 850, 8935, 77, 24, 78, 75, 182, 209, 30};

    @BeforeEach
    void setUp() {
        reader = new PlainTextArrayReader();
        parser = new PlainTextArrayParser();
        creator = new CustomArrayCreator();
    }

    @Test
    void createCustomArray() throws CustomArrayException {
        List<String> list;
        int[] resultArray;
        try {
            try {
                list = reader.readData(PATH);
            } catch (CustomArrayException e) {
                LOGGER.error("Unable to read the data!");
                throw new CustomArrayException();
            }
            resultArray = parser.parseData(list);
            creator.createCustomArray(1, resultArray);
        } catch (CustomArrayException e) {
            LOGGER.error("Unable to create an array!");
            throw new CustomArrayException();
        }
        assertArrayEquals(correctArray, resultArray);
    }

    @Test
    void createArrayWithValues() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        CustomArrayCreator creator = new CustomArrayCreator();
        creator.createCustomArrayWithValues(1, array);
        CustomArrayRepository repository = CustomArrayRepository.getInstance();
        List<CustomArray> list = repository.getRepository();
        assertArrayEquals(array, list.get(0).getArray());
    }
}