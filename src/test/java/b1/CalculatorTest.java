package b1;

import org.example.ra.bt.bt1.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    Calculator calculator = new Calculator();
@Test
    public void testAdd() {
        double resultAdd = calculator.add(3.0, 4.0);
        System.out.println("Test result of 3.0 + 4.0:");
        assertEquals(7.0, resultAdd, 0.00001);
    }
    @Test
    public void testAddWithNegativeValues() {
        double resultAdd = calculator.add(-4.5, -5.4);
        System.out.println("Test result of -4.5 - 5.4: ");
        assertEquals(-9.9, resultAdd, 0.00001);
    }
    @Test
    public void testAddWithZeroValues() {
        double resultAdd = calculator.add(9.9, 0.0);
        System.out.println("Test result of 9.9 + 0.0");
        assertEquals(9.9, resultAdd, 0.00001);
    }
    @Test
    public void testSubtract() {
        double resultSubtract = calculator.subtract(7.3, 3.7);
        System.out.println("Test result of 7.3-3.7: ");
      assertEquals(3.6, resultSubtract, 0.00001);
    }

    @Test
    public void testSubtractWithNegativeValues() {
        double resultSubtract = calculator.subtract(-3.1, -4.2);
        System.out.println("Test result of -3.1 + 4.2: ");
        assertEquals(1.1, resultSubtract, 0.00001);
    }
    @Test
    public void testSubtractWithZeroValues() {
        double resultSubtract = calculator.subtract(0.0, -0.001);
        System.out.println("Test result of 0.0 + 0.001");
       assertEquals(0.001, resultSubtract, 0.00001);
    }
    //  BT2
    @Test
    public void testMultiplication() {
        double resultMultiplication = calculator.multipilcation(1.2, 2.4);
        System.out.println("Test result of 1.2 * 2.4: ");
       assertEquals(2.88, resultMultiplication, 0.00001);
    }
    //  BT3
    @Test
    public void testDivision() {
        double resultDivision = calculator.division(6.7, 3.3);
        System.out.println("Test result of 6.7 / 3.3: ");
        assertEquals(2.03030303030303, resultDivision, 0.00001);
    }

    //  BT4
    @Test
    public void testFindMax() {
        int max = Calculator.findMax(new int[]{3, 5, 8, 1, 4, 6, 9});
        System.out.println("Find max value in array [3, 5, 8, 1, 4, 6, 9]:");
        assertEquals(9, max);
    }

    //  BT5
    @Test
    public void testFindMin() {
        int min = Calculator.findMin(new int[]{7, 5, 11, 2, 7, 4, 1});
        System.out.println("Find min value in arrray [7, 5, 11, 2, 7, 4, 1]");
        assertEquals(1, min);
    }

}

