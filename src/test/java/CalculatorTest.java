import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private static final Logger logger = Logger.getLogger(CalculatorTest.class.getName());

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }


    @Test
    void testAdd() {
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    void testMultiply() {
        assertEquals(2, calculator.multiply(2,1));
    }

    @org.junit.jupiter.api.Test
    void testDivide() {
        assertEquals(2, calculator.divide(4,2));
    }
    @Test
    public void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));

    }
    @Test
    public void testSquareRoot()  {
        assertEquals(8, calculator.squareRoot(64));
    }

    @Test
    public void testSquare(){
        assertEquals(64, calculator.square(8));
    }

    @Test
    public void testSquareRootNegativeNumber(){
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
    }
    @Test
    public void testDivideByNegativeNumber(){
        logger.info("Executing testDivideByNegativeNumber");
        try {
            calculator.divide(10, -2);
        } catch (IllegalArgumentException e) {
            logger.info("Exception thrown as expected: " + e.getMessage());
        }
    }

    @Test
    public void testSquareZero(){
        assertEquals(0, calculator.square(0));
    }

    @Test
    public void testMultiplyByZero(){
        assertEquals(0, calculator.multiply(2,0));
    }



}