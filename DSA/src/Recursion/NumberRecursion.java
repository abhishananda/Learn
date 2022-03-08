package Recursion;

import java.util.Scanner;

public class NumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print(1);
		
		 Scanner scn = new Scanner(System.in);
	      int a= scn.nextInt();
	      System.out.print(fibo(a));
	     
//	      for (int i = 0; i < n; i++) {
//	    	  
//	            System.out.print(fibo(i) + " ");
//	        }
	      
	}
	
//	static void print(int n) {
//		if(n==5) {
//			System.out.println(n);
//			return;
//		}
//			System.out.print(n+" ");
//			print(n+1);
//		
//	}
	
	
	static int fibo(int n){
	    if(n<2){
	      return n;
	    }
	    int b = fibo(n-1)+fibo(n-2);
	    return b;
	  }
	
}
