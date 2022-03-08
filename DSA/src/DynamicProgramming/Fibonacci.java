package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int fibn=Fibmemoised(n, new int[n+1]);
		System.out.println(fibn);
	}

	public static int Fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		System.out.println("hello "+n);
		int fibn1=Fib(n-1);
		int fibn2=Fib(n-2);
		int fibn=fibn1+fibn2;
		//System.out.println("sum"+fibn);
		return fibn;
	}
	
	public static int Fibmemoised(int n, int[] qb) {
		if(n==0||n==1) {
			return n;
		}
		if(qb[n]!=0) {
			return qb[n];
		}
		System.out.println("hello "+n);
		int fibn1=Fibmemoised(n-1, qb);
		int fibn2=Fibmemoised(n-2, qb);
		int fibn=fibn1+fibn2;
		
		qb[n]=fibn;
		return fibn;
	}
}
