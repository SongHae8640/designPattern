package templateCallbackEx;

import org.junit.Before;
import org.junit.Test;
import templateCallbackPattern.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        this.calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        assertEquals(10, calculator.calcSum("data/numbersEx1.txt"));
        assertEquals(4, calculator.calcSum("data/numbersEx2.txt"));
        assertEquals(8, calculator.calcSum("data/numbersEx3.txt"));
    }

    @Test
    public void multiplyTest(){
        assertEquals(24, calculator.calcMultiply("data/numbersEx1.txt"));
        assertEquals(1, calculator.calcMultiply("data/numbersEx2.txt"));
        assertEquals(16, calculator.calcMultiply("data/numbersEx3.txt"));
    }
}

