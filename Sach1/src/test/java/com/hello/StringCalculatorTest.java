package com.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	
			@Test
			public void testAdd(){
				StringCalculator.add1("1,2");
				
			}
			
			@Test(expected = RuntimeException.class)
			public void testIsNumberLengthGreaterThanTwo()
			{
				StringCalculator.add1("x,2");
			}
		}



