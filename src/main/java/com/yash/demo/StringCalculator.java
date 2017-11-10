package com.yash.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	
	/**
	 *  Main method to Add 
	 * 
	 * @param numbers
	 * @return
	 */
	public int Add(String numbers)
	{
		if(checkNullOrEmpty(numbers))
		{
			return 0;
		}
		

		String[] numberArray;
		
		if(numbers.startsWith("//"))
		{
			numberArray = getNumberArrayFromSlashString(numbers);
		}
		else
		{
			numberArray = numbers.split("\n|\\,");
		}
		
		int sum = 0;
		
		for(int i=0;i<numberArray.length;i++)
		{
			checkNegativeNumber(Integer.parseInt(numberArray[i]));
			sum = sum + (isGreaterThanThousand(Integer.parseInt(numberArray[i])) ? 0 : Integer.parseInt(numberArray[i]));
		}
		
		return sum;		
	}
	
	/**
	 * to perform operation on slash starts string
	 * 
	 * @param numbers
	 * @return
	 */
	public String[] getNumberArrayFromSlashString(String numbers)
	{
		String[] numberArray;
		if(numbers.contains("//["))
        {
        	Pattern p1 = Pattern.compile("\\[.*?\\]");
            Matcher m1 = p1.matcher(numbers);
            String unknownDelimiters ="";
            while(m1.find())
            {
            	unknownDelimiters = unknownDelimiters + m1.group().subSequence(1, m1.group().length()-1);
            }
            String extractedNumbers = numbers.substring(numbers.indexOf("\n") + 1 , numbers.length());
            numberArray = extractedNumbers.split("["+unknownDelimiters+"]");
            
        }else{
        
			String specificdelimiter = getSpecificDelimiter(numbers);
			String extractedNumbers = numbers.substring(numbers.indexOf("\n") + 1 , numbers.length());
			numberArray = extractedNumbers.split(specificdelimiter);
        }
		
		return numberArray;
	}
	
	/**
	 *  to check if number is greater than 1000 or not
	 * 
	 * @param n
	 * @return
	 */
	public boolean isGreaterThanThousand(int n)
	{
		return n > 1000 ;
	}
	
	/**
	 * to check if negative number than throw NumberFormatException 
	 * 
	 * @param n
	 */
	public void checkNegativeNumber(int n)
	{
		if(n < 0)
		{
			throw new NumberFormatException("negatives not allowed");
		}
	}
	
	/**
	 * return specific delimeter from input string
	 * 
	 * @param numbers
	 * @return
	 */
	public String getSpecificDelimiter(String numbers)
	{
		return numbers.substring(2, numbers.indexOf("\n"));
	}
	
	/**
	 * this method to check null or empty numbers
	 * 
	 * @param numbers
	 * @return
	 */
	boolean checkNullOrEmpty(String numbers)
	{
		return numbers == null || numbers.isEmpty();
	}
	
	
}
