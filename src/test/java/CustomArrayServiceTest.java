import com.company.task3.entity.CustomArray;
import com.company.task3.exception.CustomArrayException;
import com.company.task3.service.CustomArrayService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayServiceTest {
    private static final String PATH = "C:\\Users\\super\\Desktop\\GELO\\Files\\numbers.txt";
    CustomArrayService service = new CustomArrayService();
    CustomArray customArray;
    int[] array = {1, 23, 45, 6, 7, 89, 4554, 43, 52};

    @BeforeEach
    void setUp() {
        customArray = new CustomArray(1, array);
    }

    @Test
    void findMaxElement() throws CustomArrayException {
        int result = service.findMaxElement(customArray);
        assertEquals(454, result);
    }

    @Test
    void findMinElement() throws CustomArrayException {
        int result = service.findMinElement(customArray);
        assertEquals(1, result);
    }
}