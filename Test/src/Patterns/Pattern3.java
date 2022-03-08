package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int a=n-1;
		int b=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<b;j++) {
				System.out.print("*\t");
			}
			a--;
			b++;
			System.out.println();
		}

	}

}
