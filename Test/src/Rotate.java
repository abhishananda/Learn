import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int k = scn.nextInt();
		
		int len=String.valueOf(n).length();
		
		k=k%len;
		if(k<0) {
			k=k+len;
		}

		int digit=n%(int)Math.pow(10, k);
				
		int c=digit*(int)Math.pow(10,len-k);
		
		System.out.println(c+n/(int)Math.pow(10, k));
		
		
	}

}
