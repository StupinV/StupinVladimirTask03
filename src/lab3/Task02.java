package lab3;

public class Task02 {

    public static void main(String[] args) {
    	 
	  System.out.println("This is the start of this program!");
	  System.out.println(" ");
	 
      int p = 3;
      int k = 2;
	  int[][] array = new int [4] [4]; 
	  int x = 0;
	  
	  for(int i = 0; i < array.length; i ++) {
		  
		  for(int j = 0; j < array[i].length; j ++) {
			  
			  array[i][j] = x;
			  x++;
			  System.out.print(array[i][j] + " ");
			  
		  }
		  
		  System.out.println("");
	  }
	  
	  System.out.println("");
	  System.out.println("Answer:");
	  
	  for(int i = 0; i < array.length; i++ ) {
		  
		  System.out.print(array[k][i] + " ");
		  
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Answer:");
	  
	  for(int i = 0; i < array.length; i++ ) {
		  
		  System.out.println(array[i][p]);
		  
	  }

      System.out.println(" ");
      System.out.println("This is the end of this program!"); 
     
    }
  
}