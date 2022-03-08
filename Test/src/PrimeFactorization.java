import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		while(n%2==0) {
			System.out.print(2+" ");
			n=n/2;
		}
		
		for(int i=3;i<Math.sqrt(n);i++) {
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
		}
		System.out.print(n+" ");
	}

}
