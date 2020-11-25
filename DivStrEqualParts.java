package com.ProgramsJava;
import java.util.Scanner;


public class DivStrEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		int n = scn.nextInt();
		
		checkstrequal(str1, n);
		usingSubstring(str1);
		scn.close();
	}
	public static void checkstrequal(String str1, int n)
	{
		int len = str1.length();
		int temp = 0, ch = len/n;
		//Store the array of the string
		String[] equalStr = new String[n];
		
		if(len%n != 0)
		{
			System.out.println("This string cannot be divided into equal parts.");
		}
		
		
		for(int i = 0; i <len; i=i+ch)
		{
			String part = str1.substring(i,i+ch);
			equalStr[temp] = part;
			temp++;
		}
		System.out.println(n+"equal parts of a given string are ");
		for (int i = 0; i< equalStr.length;i++)
		{
			System.out.println(equalStr[i]);
		}
	}
	public static void usingSubstring(String str1)
	{
		System.out.println(str1.substring(1,2));
	}
}

