package com.ProgramsJava;
import java.util.Scanner;

public class StrAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		
		for(int i = 0; i< str1.length();i++)
		{
			for(int j = str2.length()-1; j>=0 ; j--)
			{
				if(str1.charAt(i) == str2.charAt(j))
				{
					System.out.println("yes "+str1.charAt(i)+" matches "+str2.charAt(j));
					continue;
				}
			}
			
		}
		System.out.println("yes the string is anagram");
	}

}
