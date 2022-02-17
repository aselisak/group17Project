package goup17Project;

public class Task2 {

	public static void main(String[] args) {
		// // Create a 2D array of integer values. Print the sum of all numbers.
		
		int [][] numbers = {
				
			{10, 20, 30, 40 },//row 0
			
			{100, 200, 300, 400},// row 1
			
			{1000, 2000, 3000, 4000 }// row 2
		
		};
		int sum=0;
       
        for (int [] innerArray : numbers) {
        	for (int i : innerArray) {
        		sum+= i;
        		
        		
        	}
        }
         System.out.println("The sum of all numbers "+sum);


	}

}
