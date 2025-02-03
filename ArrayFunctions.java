// ArrayFunctions.java class

import java.util.*;
class ArrayFunctions
{
	public void display(ArrayList<Integer> arr)
	{
		System.out.println("Array is: "+arr);
	}
	
	public void oddEven(int[] arr)
	{
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		}
		System.out.println("Odd numbers");
		display(odd);
		System.out.println("Even numbers");
		display(even);
	}
	public int minDiff(int[] arr)
	{
		int min = arr[0] - arr[1];
		int index = 0;
		for(int i=0;i<(arr.length-1);i++)
		{
			if(min >= (arr[i]-arr[i+1]))
			{
				min = arr[i] - arr[i+1];
				index = i;
			}
		}
		return index;
	}
}