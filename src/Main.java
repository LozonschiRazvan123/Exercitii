import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static Boolean checkSubstring(String a, String b)
	{
		return a.indexOf(b) != -1;
	}
	
	public static Boolean check(String a)
	{
		String pattern = "(B \\d{2,3} [A-Z]{3}|[A-Z]{2} \\d{2,3} [A-Z]{3})";
		return pattern != null && a.matches(pattern);
	}
	
	public static int[] eliminateDuplicate(Integer[] a)
	{
		Set<Integer> B = new LinkedHashSet<> ();
		for(Integer num = 0; num < a.length; num++)
		{
			B.add(num);
		}
		
		
		int[] newUnicArray = new int[B.size()];
		int nr = 0;
		for(Integer num:B)
		{
			newUnicArray[nr++] = num;
		}
		
		return newUnicArray;
			
	}
	
	
	public static int[][] matrix(int[][] A, int[][] B) 
	{
	    int[][] C = new int[A.length][B[0].length]; 
	    for (int i = 0; i < A.length; i++) {
	        for (int j = 0; j < B[0].length; j++) { 
	            for (int k = 0; k < A[0].length; k++) { 
	                C[i][j] += A[i][k] * B[k][j]; 
	            }
	        }
	    }
	    return C;
	}
	
	public static void main(String[] args) {
		/*
		 * String a = "Javascript"; String b = "java";
		 * System.out.println(checkSubstring(a.toLowerCase(),b.toLowerCase()));
		 */
		
		
		/*
		 * String c = "B 153 ABC"; System.out.println(check(c));
		 * 
		 * Integer[] numbers = new Integer[]{1,2,3,4,5,5,5,3,2}; int[]
		 * numbersWithoutDuplicate = eliminateDuplicate(numbers); for(int i = 0; i<
		 * numbersWithoutDuplicate.length;i++)
		 * System.out.print(numbersWithoutDuplicate[i] + " ");
		 */
		
		
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] B = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] C = matrix(A,B);
		for(int i = 0; i<C.length;i++)
		{
			for(int j = 0;j<C[0].length;j++)
				System.out.print(C[i][j] + " ");
			System.out.println();
		}
				
	}
}
