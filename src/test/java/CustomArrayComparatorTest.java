import com.company.task3.comparator.CapacityComparator;
import com.company.task3.comparator.FirstElementComparator;
import com.company.task3.comparator.IdComparator;
import com.company.task3.comparator.LastElementComparator;
import com.company.task3.entity.CustomArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayComparatorTest {
    CustomArray customArray1;
    CustomArray customArray2;
    int[] array1 = {12, 3, 4, 56, 7, 89};
    int[] array2 = {98, 76, 5, 4, 3, 21};

    @BeforeEach
    void setUp() {
        customArray1 = new CustomArray(1, array1);
        customArray2 = new CustomArray(2, array2);
    }

    @Test
    void compareCapacity() {
        CapacityComparator capacityComparator = new CapacityComparator();
        int result = capacityComparator.compare(customArray1, customArray2);
        assertEquals(result, 0);
    }

    @Test
    void compareId() {
        IdComparator idComparator = new IdComparator();
        int result = idComparator.compare(customArray1, customArray2);
        assertEquals(result, -1);
    }

    @Test
    void compareFirstElement() {
        FirstElementComparator firstElementComparator = new FirstElementComparator();
        int result = firstElementComparator.compare(customArray1, customArray2);
        assertEquals(result, -1);
    }

    @Test
    void compareLastElement() {
        LastElementComparator lastElementComparator = new LastElementComparator();
        int result = lastElementComparator.compare(customArray1, customArray2);
        assertEquals(result, 1);
    }
}