package lab3;

public class Task11 {
	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
        int count = 0;
        int count_i = 0;
		int[][] array = new int [n] [n]; 
		
		for(int i = 0; i < n; i ++) {
			
			for(int j = 0; j < n; j ++) {
				
				array[i][j] = (int) (Math.random()*15);
				System.out.print(array[i][j] + " "); 
				if(array[i][j]==5)
					count++;
				
			}
			
			System.out.println(" ");
			
		}
		System.out.println(" ");
		
		if(count >= 3) {
			
			System.out.println("Number of strings : ");
			for(int i = 0; i < n; i ++) {
			
				count_i = 0;
				for(int j = 0; j < n; j ++) {
				
					if(array[i][j] == 5) {
					
						count_i++;
					
						if(count_i >= 3) {
						
							System.out.print(i + " ");
						
						}	
					
					}
				
				}
			
			}
			
		}
		
		else {
			System.out.println("There aren't enough numbers 5 in string.");
		}
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 
		
    }
	
}