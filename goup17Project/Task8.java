package goup17Project;

public class Task8 {

	public static void main(String[] args) {
		/*
		Maximum and minimum number in the array?
	 */
	
	int[] numbers = {2,27,35,43,99,1999};
	
	int maxValue = numbers[0];
	
	  for(int i=1;i < numbers.length;i++){
	    if(numbers[i] > maxValue){
	      maxValue = numbers[i];
	    }
	  }
	  System.out.println("The maximum number is in the array is "+ maxValue);
    
		System.out.println("----------------------------------------");

	  int minValue = numbers[0];
	  
	  for(int i=1;i<numbers.length;i++){
	    if(numbers[i] < minValue){
	      minValue = numbers[i];
	    }
	  }
	  System.out.println("The minimum number is in the array is "+ minValue);

	}

}
