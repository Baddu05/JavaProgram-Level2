package com.ProgramsJava;
import java.util.Scanner;
public class MatricMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				a[i][j] = scn.nextInt();
				b[i][j] = scn.nextInt();
			}
		}
		
		for(int i = 0; i<3; i++)
		{
			
			for(int j = 0; j<3; j++)
			{
				c[i][j] = 0;
				for(int k = 0; k<3; k++)
				{
					c[i][j] += a[i][k] *b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
