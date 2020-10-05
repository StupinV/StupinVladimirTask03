package lab3;

public class Task10 {

	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
        int n = 4;
        int count = 0;
		int[][] array = new int [n] [n]; 
		
		for(int i = 0; i < n; i ++) {
			
			for(int j = 0; j < n; j ++) {
				
				array[i][j] = (int) (Math.random()*15 - 5);
				System.out.print(array[i][j] + " ");
				if ((i == j)&&(array[i][j]>0)) {
					count++;
				}
				
			}
			
			System.out.println(" ");
			
		}
		int[] newArray = new int[count];
		count = 0;
		for(int i = 0; i < n; i ++) {
			
			for(int j = 0; j < n; j ++) {
			
				if ((i == j)&&(array[i][j]>0)) {
					
					newArray[count] = array[i][j];
					count++;
					
				}
				
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("NewArray : ");
		for(int i = 0; i < count; i ++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 
				
	}

}
