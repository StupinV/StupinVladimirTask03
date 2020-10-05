package lab3;

public class Task9 {

	public static void main(String[] args) {
		
		System.out.println("This is the start of this program!");
		System.out.println(" ");
		System.out.println("Array : ");
        int n = 4;
        int N = (int) Math.pow(n, 2);
        int[] array = new int[N];
		int[][] matrix = new int [n] [n]; 
		int x = 0;
		int count = 0;
	    
		for(int i = 0; i < array.length; i ++) {
			x++;
			array[i] = x;
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Matrix : ");
		for(int i = 0; i < n; i ++) {
			
			for(int j = 0; j < n; j ++) { 
						
				matrix[i][j] = (int) Math.pow(array[count],i+1);
				count++;
				System.out.print(matrix[i][j]+" ");
			}	
			System.out.println();
	    }
		
	    System.out.println(" ");
	    System.out.println("This is the end of this program!"); 

	}

}
