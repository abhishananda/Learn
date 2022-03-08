package Array;

import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int n=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
//		for(int j=n-1;j>=0;j--) {
//			System.out.print(arr[j]+" ");
//		}
		int temp;
		int start=0;
		int end=n-1;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;		
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
