package simpleTests;

import application.Calculator;


public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }

  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)


}
