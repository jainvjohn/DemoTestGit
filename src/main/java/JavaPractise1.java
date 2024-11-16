import java.util.Arrays;
import java.util.Scanner;

public class JavaPractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  Scanner sc= new Scanner(System.in);
//	      System.out.println("Enter the size of array");
//	      int arrSize=sc.nextInt();
//	         
//	      int numerals[];
//	      numerals=new int[arrSize];
//	      System.out.println("Enter the array elements");
//	        
//	        for(int i=0;i<=arrSize-1;i++)
//	        {
//	           numerals[i]=sc.nextInt(); 
//	        }
//	        System.out.println("The array elements are");
	      
			int[] numerals={20,11,14,3,2};
			int  arrSize=numerals.length;
	        
			for (int i=0;i<arrSize;i++)
	        {
	        	 System.out.print(numerals[i]+" ");
	 	        
	        }
	        
	        Arrays.sort(numerals);
	        System.out.println("\nAfter Sorting\n");
	        for (int i=0;i<arrSize;i++)
	        {
	        	 System.out.print(numerals[i]+" ");
	 	        
	        }
	        
	}

}
