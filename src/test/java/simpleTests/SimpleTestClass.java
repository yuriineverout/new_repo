package simpleTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void subtraction() {
        int actualResult = calc.subtraction(21, 10);
        assertEquals("21 - 10 must be 11", 11, actualResult);
    }

    @Test
    public void multiplication() {
        int actualResult = calc.multiplication(12, 12);
        assertEquals("12 +12 must be 24", 24, actualResult);
    }

    @Test
    public void division (){
        int actualResult = calc.division(100,50);
        assertEquals("100/50 must be 2",2, actualResult);
    }
    @Test
    public void aquareRoot () {
        double actualResult = calc.squareRoot(100);
        assertEquals("10", 10, actualResult,0.1);
    }
    @Test
    public void power () {
        double actualResult = calc.power(10,2);
        assertEquals("100", 100, actualResult, 0.1 );
    }
    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)

    @Test
    public void avr() {
        double actualResult = calc.avr(12,24,54);
        assertEquals("must be 30", 30, actualResult, 0.1);
    }
    @Test
    public void evenOdd() {
        boolean actualResult = calc.evenOdd(2);
        assertEquals("is equal", true, actualResult);
        actualResult = calc.evenOdd(3);
        assertEquals("is not equal", false, actualResult);
    }
    @Test
    public void biggestValue() {
        int actualResult = calc.biggestValue (2, 4);
        assertEquals("is biggerl", 4, actualResult);
        actualResult = calc.biggestValue (5, 5);
        assertEquals("is equal", 0, actualResult);

    }
    @Test
    public void sumAll(){
        int actualResult = calc.sumAll(5,5);
        assertEquals ("sum of all numbers", 10, actualResult);

    }
    @Test
    public void divide (){
        float actualResult = calc.divide(20, 10);
        assertEquals ("not zero", 2, actualResult, 0.1);
        actualResult = calc.divide(20, 0);
        assertEquals ("with zero", -100, actualResult, 0.1);

    }
}
