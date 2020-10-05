package lab3;

public class Task05 {

	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
		int[][] array = new int [n] [n]; 
		int x = 1;
	  
		for(int i = 0; i < array.length; i ++) {
			  
			for(int j = 0; j < array[i].length; j ++) { 
				if(j == n-1) {
				   array[i][j] = x;
				   x++;
				   n--;
				}
					  
				System.out.print(array[i][j] + " ");
				  
			}
			System.out.println(" ");
	    }
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 

	}

}
