package goup17Project;

public class Task3 {

	public static void main(String[] args) {
		/* Create a 2D array or integer type where you will store odd and even numbers. 
		Develop a program which will identify/print the even numbers only.
		*/

		
		int[][] numbers = {
						
						{1,2,3,4},  //0
						{10,21,32,43},  //1
						{56,66,67,99}  //2
						
				};
		
		for (int i = 0; i < numbers.length; i++) {
			  for (int j = 0; j < numbers[i].length; j++) {
				    if(numbers[i][j]%2==0) {
				        System.out.println(numbers[i][j]); 
				    } 
				  }
				}
	}

}
