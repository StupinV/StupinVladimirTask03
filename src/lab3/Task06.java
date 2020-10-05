package lab3;

public class Task06 {

	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
		int[][] array = new int [n] [n]; 
	  
		for(int i = 0; i < array.length; i ++) {
			  
			for(int j = 0; j < array[i].length; j ++) { 
				if((i == 0)||(j == 0)||(i == n - 1)||(j == n - 1)) {
				   array[i][j] = 1;
				}
					  
				System.out.print(array[i][j] + " ");
				  
			}
			System.out.println(" ");
	    }
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 

	}

}
