package goup17Project;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// 	// Create an array on int values using a scanner 
		// and calculate the sum of all stored elements in that array.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the required size of Array");
		
		int number=input.nextInt();
		
		int array []=new int[number];
		
		int sum=0;
		
		System.out.println("Enter the elememnts of array one by one");
		
		for (int i=0; i<number; i++) {
			array[i]=input.nextInt();
		sum=sum+array[i];
		
		System.out.print("Elements of the array are:[ ");
	
		for(int elements:array) {
			System.out.print(elements+" ");
			System.out.print("]");
			System.out.println("");
			System.out.println("Sum of the elements of the array: "+sum);
			
			input.close();
		}
		}
			
	}

}
