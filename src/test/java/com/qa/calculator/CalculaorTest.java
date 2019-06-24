package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculaorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
	Calculator calculator = new Calculator();
	int result = calculator.add(2,2);
	Assert.assertEquals(4, result);
	}

	public void subtractTwoNumbersTest() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,5);
        Assert.assertEquals(5, result);
}
	public void multiplyTwoNumbersTest() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,5);
        Assert.assertEquals(10, result);
}
}