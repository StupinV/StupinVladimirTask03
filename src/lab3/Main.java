package lab3;

public class Main {
	
    public static void main(String[] args) {
    	 
	  System.out.println("This is the start of this program!");
	  System.out.println(" ");

	  int[][] array = new int [4] [4]; 
	  int x = 0;
	  
	  for(int i = 0; i < array.length; i ++) {
		  
		  for(int j = 0; j < array[i].length; j ++) {
			  
			  array[i][j] = x;
			  x++;
			  System.out.print(array[i][j] + " ");
			  
		  }
		  System.out.println(" ");
	  }

	  System.out.println("Answer:");
	  
	  for(int i = 0; i < array.length; i ++) {
		  
		  for(int j = 0; j < array[i].length; j ++) {	 
			  
			  if (i == j) {
				  
				  System.out.print(array[i][j] + " ");
				  
			  }
			  
		  }
		  
	  }  
    	
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("This is the end of this program!"); 
     
    }
  
}
