package com.ProgramsJava;
import java.util.Scanner;
public class SubsetStringProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String enterString = scn.next();
		subsetString(enterString);
	}
	public static void subsetString(String enterString)
	{		
		int len = enterString.length();
		int temp = 0;
		String []arr= new String[len*(len+1)/2];
		
		for(int i = 0; i< len;i++)
		{
			for(int j = i; j<len;j++)
			{
				arr[temp] = enterString.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("All subsets of the given string are");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
