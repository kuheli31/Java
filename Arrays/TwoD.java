//WAP to print array elements.

import java.util.*;
public class TwoD{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	//Defining a array of arrays
	int[][] arr = new int[3][4];


	//Populating array elements
	System.out.println("Enter Datas:");
	for(int i=0; i<3 ; i++)
	{
	  for(int j=0 ; j<4 ; j++)
	  {
	   arr[i][j] = sc.nextInt();
	  }	
	}


	//Printing array elements
	System.out.println("Datas:");
	for(int i=0; i<3 ; i++)
	{
	  for(int j=0 ; j<4 ; j++)
	  {
	   System.out.print(arr[i][j]);
	  }	
	System.out.println();
	}
}
}
