package com.ProgramsJava;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input_val = scanner.nextInt();
		int i = 1;
		while(i<=input_val)
		{
			System.out.println(i);
			i++;
		}
		scanner.close();
	}

}
