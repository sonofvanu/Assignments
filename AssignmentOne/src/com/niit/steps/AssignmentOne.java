package com.niit.steps;

import java.util.Scanner;

public class AssignmentOne {
	private int length;
	public int[] inputQuery()
	{
		int numberInput;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		numberInput=s.nextInt();
		if((int)(Math.log10(numberInput)+1)<=1){
			System.out.println("Enter an input atleat of two digits");
		}
		return numberSplitter(numberInput);	
	}
	
	
	public int[] numberSplitter(int numberInput)
	{		
		length=(int)(Math.log10(numberInput)+1);
		int[] number=new int[length];
		for(int i=length;i>0;i--)
		{
			number[i-1]=numberInput%10;
			numberInput=numberInput/10;
		}
		
		return number;
	}

	public int[] ascendingOrder(int[] number)
	{
		int[] unsortNumber=number;
		for (int i = 0; i < length; i++) 
        {
            for (int j = i + 1; j < length; j++) 
            {
                if (unsortNumber[i] > unsortNumber[j]) 
                {
                   int temp = unsortNumber[i];
                    unsortNumber[i] = unsortNumber[j];
                    unsortNumber[j] = temp;
                }
            }
        }
		
		return unsortNumber;
	}
	
	
	public int addingEvenNumbers(int[] number)
	{
		int addEven=0;
		for(int i:number)
		{
			if(i%2==0)
			{
				addEven+=i;
			}
		}
		return addEven;
	}
	
	public int addingOddNumbers(int[] number)
	{
		int addOdd=0;
		for(int i:number)
		{
			if(i%2!=0)
			{
				addOdd+=i;
			}
		}
		return addOdd;
	}
}
