import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] A= new int[n];
		
		for(int i=0;i<n;i++) {
			A[i]=scn.nextInt();
		}
		
		Arrays.sort(A);
		for(int j=n;j>0;j--) {
			if(j==n-2)
				System.out.print(A[n-2]+" ");
			
			if(j==1)
				System.out.print(A[j]);
			
		}
		
		
	}

}
