package JavaRevisitedSite;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MultiplyTwoArrays {

	public static void main(String args[])
	{
		
		int matrix1[][]= {{1,2},{3,4}};
		int matrix2[][]= {{5},{6}};
		int temp=0;int[] result[]=new int[2][2];

		
		int a[][]=new int[2][3];
		
		System.out.println(a.length);
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				temp=0;
				for(int k=0;k<matrix1.length;k++)
				{
					temp+=matrix1[i][k]*matrix2[k][j];
				}
				result[i][j]=temp;
				System.out.print(result[i][j]+"	");
			}
			System.out.println();
		}
	}
}
