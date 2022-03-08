import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		
		int a=num1*num2;
		
		while(num1%num2!=0) {
			int rem=num1%num2;
			num1=num2;
			num2=rem;

		}
		System.out.println(num2);//GCD
		System.out.println(a/num2);//LCM
	}

}
