import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

class EvenStringChecker implements StringChecker {
    public boolean checkString(String s) {
        return s.length() % 2 == 0;
    }
}

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
        List<String> expected1 = Arrays.asList("bb", "dddd");
        assertEquals(expected1, ListExamples.filter(input1, new EvenStringChecker()));
    }

    @Test
    public void testMerge() {
        List<String> input1 = Arrays.asList("a", "c", "e", "g");
        List<String> input2 = Arrays.asList("b", "d", "f", "h");
        List<String> expected1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        assertEquals(expected1, ListExamples.merge(input1, input2));
    }
}
