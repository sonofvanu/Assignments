package com.niit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.niit.steps.AssignmentOne;

public class TestCase {

	AssignmentOne assignmentOne;
	
	
	@Before
	public void objectCreator()
	{
		assignmentOne=new AssignmentOne();
	}
	
	@Test
	public void stringQueryInput()
	{
		int[] numberInput=assignmentOne.inputQuery();
		assertNotNull(numberInput);
		for(int integer:numberInput)
		{
			System.out.print(integer+"   ");
		}
		
	}
	
	@Test
	public void ordering()
	{
		int[] numberInput=assignmentOne.inputQuery();
		int[] ascendingSort=assignmentOne.ascendingOrder(numberInput);
		assertNotNull(ascendingSort);
		for(int integer:ascendingSort)
		{
			System.out.print(integer);
		}
		
	}
	
	
	@Test
	public void addingEvenEntry()
	{
		int[] numberInput=assignmentOne.inputQuery();
		int addedEven=assignmentOne.addingEvenNumbers(numberInput);
		assertTrue("im not empty",(int)(Math.log10(addedEven)+1)>0);
		System.out.print(addedEven);
	}
	
	@Test
	public void addingOddEntry()
	{
		int[] numberInput=assignmentOne.inputQuery();
		int addedOdd=assignmentOne.addingOddNumbers(numberInput);
		assertTrue("im not empty",(int)(Math.log10(addedOdd)+1)>0);
		System.out.print(addedOdd);
	}
	

}
