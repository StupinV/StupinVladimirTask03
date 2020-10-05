package lab3;

public class Task08 {

public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
		int[][] array = new int [n] [n]; 
		int x = 1;
		int first = x;
		int count = n;
	  
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) { 
				
				array[i][j] = x;
				x++;
				
			}
			first = first + 1;
			x = first;
			
	    }
		
		for(int i = 0; i < n; i ++) {
			count--;
			for(int j = n-1; count < j; j --) { 
						
				array[i][j] = 0;
				
			}
			
		}	
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) { 
				System.out.print(array[i][j]+" ");  
			}
			System.out.println(" ");
	    }
		
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 

	}

}
