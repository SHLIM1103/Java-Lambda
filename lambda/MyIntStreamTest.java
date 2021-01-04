package lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.IntSummaryStatistics;

import static java.util.Arrays.asList;

import org.junit.Test;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();
    
    
    @Test
    public void returnList() { // 1.
        assertTrue(asList(1, 2, 3, 4).equals(le.rangeTest(1, 5)));
    }

   
    @Test
    public void allMatchEvenTest() { // 2.
        assertTrue(le.allMatchEvenTest(2));
    }
    
   
    @Test    
    public void ofBoxTest() { // 3.
        assertTrue(asList(1, 2, 3, 4).equals(le.ofBoxTest()));
    }

    @Test
    public void concatTest() { // 4.
        assertTrue(asList(1, 2, 3).equals(le.concatTest()));
    }

    @Test
    public void collectTest() { // 5.
        assertTrue(asList(2,4,6,8,10).equals(le.collectTest()));
    }

    @Test
    public void averageTest() { // 6.
        assertEquals(3.0, le.averageTest(1, 6));
    }

    @Test
    public void builderTest() { // 7.
        assertTrue(asList(1,2,3).equals(le.builderTest()));
    }
    
    /*
    @Test
    public void summaryStatisticsTest() { // 8.
        IntSummaryStatistics stats = summaryStatisticsTest(1, 4, 17, 25).mapToInt(toInt).sorted().skip(i).summaryStatistics();
        assertEquals(11, stats.getCount());
        assertEquals(170, stats.getSum());
        assertEquals(1, stats.getMin());
        assertEquals(15.454545, stats.getAverage());
        assertEquals(24, stats.getMax());
    }
    */

    @Test
    public void countTest() { // 9.
        assertEquals(85, le.countTest(1, 86));
    }

    @Test
    public void distincTest() { // 10.
        assertTrue(asList(4, 3, 1, 8, 5, 6).equals(le.distinctTest()));
    }

    @Test
    public void emptyTest() { // 11.
        assertEquals(0, le.emptyTest());
    }

    @Test
    public void findFirstTest() { //12. 
        assertEquals(91, le.findFirstTest());
    }

    @Test
    public void flatMapTest() { // 13.
        assertTrue(asList(2, 4, 6, 8, 10, 3, 6, 9, 12, 15, 5, 10, 15, 20, 25, 7, 14, 21, 28, 35).equals(le.flatMapTest()));
    }

    @Test
    public void generateTest() { // 14.
        assertTrue(asList(6, 10, 52, 58, 38).equals(le.generateTest()));
    }

    @Test
    public void iterateTest() { // 15.
        assertTrue(asList(10, 15, 20, 25, 30).equals(le.iterateTest()));
    }
    
    @Test
    public void mapTest() { // 16.
        assertTrue(asList(2, 4, 6, 8, 10, 12, 14).equals(le.mapTest(1, 8)));
    }

    @Test
    public void maxTest() { // 17.
        assertEquals(397, le.maxTest());
    }

    @Test
    public void peekTest() { // 18.
        assertFalse(le.peekTest());
    }

    @Test
    public void rangeClosedTest() { // 19.
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.rangeClosedTest()));

    }

    @Test
    public void reduceTest() { // 20.
        assertEquals(55, le.reduceTest(1, 10));
    }

    @Test
    public void sequentialTest() { // 21.
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sequentialTest()));
    }

    @Test
    public void parallelTest() { // 22.
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.parallelTest()));
    }

    @Test
    public void skipTest() { // 23.
        assertTrue(asList(4, 5).equals(le.skipTest()));
    }

    @Test
    public void sortTest() { // 24.
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sortTest()));
    }
}