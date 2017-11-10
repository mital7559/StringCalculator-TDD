package com.yash.demo;

import org.junit.Test;

import junit.framework.Assert;
import mockit.Expectations;
import mockit.Mocked;

public class StringCalculatorTest {

	
	StringCalculator stringCalculator = new StringCalculator();
	
	
	/**
	 * this test case is for Null input
	 */
	@Test
	public void Add_isNull_True()
	{
		String numbers = null;
		Assert.assertEquals(0, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is for Empty input
	 */
	@Test
	public void Add_isEmpty_True()
	{
		String numbers = "";
		Assert.assertEquals(0, stringCalculator.Add(numbers));
	}
	
	/**
	 * this test case is for one input number
	 */
	@Test
	public void Add_isEmpty_False_OneNumber_Sum()
	{
		String numbers = "1";
		Assert.assertEquals(1, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is for two input number
	 */
	@Test
	public void Add_isEmpty_False_TwoNumber_Sum()
	{
		String numbers = "1,2";
		Assert.assertEquals(3, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is for unknown input numbers
	 */
	@Test
	public void Add_isEmpty_False_Unknown_Number_Sum()
	{
		String numbers = "1,4,2,6,4,7";
		Assert.assertEquals(24, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is to check for \n delimiter is handled 
	 */
	@Test
	public void Add_isEmpty_False_checkFor_NewLine_Delimiter()
	{
		String numbers = "1\n2,3";
		Assert.assertEquals(6, stringCalculator.Add(numbers));
	}
	
	/**
	 * this test case is to check with input parameter starts with " // "
	 */
	@Test
	public void Add_isEmpty_False_If_StartsWith_ForwardSlashes()
	{
		String numbers = "//;\n1;3;4";
		Assert.assertEquals(8, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is to check with Negative input parameter which will throw NumberFormatException
	 */
	@Test(expected = NumberFormatException.class)
	public void Add_isEmpty_False_Negative_number_Exception()
	{
		String numbers = "//;\n-1;3;4";
		stringCalculator.Add(numbers);
	}
	
	/**
	 * this test case is to check with input parameter value greater than 1000
	 */
	@Test
	public void Add_isEmpty_False_For_Value_GreaterThan_1000()
	{
		String numbers = "//;\n1002;3;4";
		Assert.assertEquals(7, stringCalculator.Add(numbers));
	}
	
	
	/**
	 * this test case is to check with input parameter having delimiter of any length
	 */
	@Test
	public void Add_AnyLenghth_Delimiter()
	{
		String numbers = "//;;;\n1;;;3;;;4";
		Assert.assertEquals(8, stringCalculator.Add(numbers));
	}
	
	/**
	 * this test case is to check with input parameter having delimiter of any length and any types of
	 */
	@Test
	public void Add_AnyLenghth_DifferentTypes_Delimiter()
	{
		String numbers = "//[***][%%]\n1*2%3";
		Assert.assertEquals(6, stringCalculator.Add(numbers));
	}
	
}
