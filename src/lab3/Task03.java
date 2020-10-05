package lab3;

public class Task03 {
	public static void main(String[] args) {
        
		System.out.println("This is the start of this program!");
		System.out.println(" ");
		
		int x = 0;
		int m = 4;
		int n = 4;
		int[][] array = new int [m] [n]; 
		
		  for(int i = 0; i < array.length; i ++) {
			  
			  for(int j = 0; j < array[i].length; j ++) {
				  
				  array[i][j] = x;
				  x++;
				  System.out.print(array[i][j] + " ");
				  
			  }
			  System.out.println(" ");
			  
		  }
		 
		  System.out.println(" ");
		  System.out.println("Answer:");
		  System.out.println(" ");
		  
		  for(int i = 0; i < array.length; i ++) {
			  
			  if(i % 2 == 0) {
			  
				  for(int j = array[i].length - 1; j != -1; j --) {
				   
					  System.out.print(array[i][j] + " ");
	  
				  }	
			  
			  }
			  
			  else {
				  
				  for(int j = 0; j < array[i].length; j ++) {
					  
					  System.out.print(array[i][j] + " ");
					  
				  }
				  
			  }
		
			  System.out.println(" ");
			  
		  }  
	      System.out.println(" ");
	      System.out.println("This is the end of this program!"); 
		}
		
	}
