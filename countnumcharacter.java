package com.ProgramsJava;
import java.util.Scanner;

public class countnumcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String strn = scn.next();
		calCountstrchar(strn);
		countvowelandconstchar(strn);
		}
	public static void calCountstrchar(String strn)
	{
		int count = 0;
		for(int i = 0; i < strn.length();i++)
		{	
			count++;
		}
		//System.out.print(count);
	}
	
	public static void countvowelandconstchar(String strn)
	{
		int vCount = 0; 
		int chCount = 0;
		for(int i = 0; i < strn.length(); i++)
		{
			if(strn.charAt(i)== 'a'||strn.charAt(i)== 'e'||strn.charAt(i)== 'i'||strn.charAt(i)== 'o'||strn.charAt(i)== 'u')
			{
				System.out.println("Character which are vowels");
				System.out.println(strn.charAt(i));
				vCount++;
			}
			else if((strn.charAt(i)>='a' && strn.charAt(i)<='z')||(strn.charAt(i)>='A' && strn.charAt(i)<='Z'))
			{
				System.out.println("Characters which are constants");
				System.out.println(strn.charAt(i));
				chCount++;
			}
		}
		System.out.println("Number of vowels :"+vCount);
		System.out.println("Number of constants :"+chCount);
	}

}
