import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int i,j, count=0;
		
		for(i=m;i<n;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
			count=0;
		}
	}

}
