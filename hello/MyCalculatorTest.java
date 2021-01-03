package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalculatorTest {
    MyCalculator calculator = new MyCalculator();

    @Test
    public void add(){
        assertEquals(6, calculator.plus(5, 1));
    }

    @Test
    public void minus(){
        assertEquals(4, calculator.minus(5, 1));
    }

    @Test
    public void multi(){
        assertEquals(5, calculator.multi(5, 1));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(5, 1));
    }
}