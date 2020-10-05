package lab3;

public class Task12 {

	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
        int count = 0;
		int[][] array = new int [n] [n]; 
		
		for(int i = 0; i < n; i ++) {
			count = 0;
			for(int j = 0; j < n; j ++) {
				
				if(count != i) {	
					
				   array[i][j] = (int) Math.round((Math.random())); 
				   if(array[i][j] == 1) {
					   
					   count++;
					   
				   }
				   else {
					   array[i][j]=1;
					   count++;
				   }
				   
				}
				else 
				   array[i][j] = 0;
				
				System.out.print(array[i][j] + " "); 

			}
			System.out.println(" ");
		}	

	}

}