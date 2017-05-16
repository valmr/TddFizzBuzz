package com.fdmgroup.TddFizzBuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTester {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void init(){
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testFizzBuzzToTargetWithTwentyOneReturnsCorrectString(){
		String expectedResult = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz,Fizz";
		assertEquals(expectedResult, fizzBuzz.toTarget(21));
	}
}














