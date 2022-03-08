package Recursion;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		
		int []arr1 = {1,2,3,4,66,77,35,78};
		
		System.out.println(search(arr1,0,8,2));
	}
	
	static int search(int[] arr, int s, int e, int x) {
		if(s<=e) {
			int mid=s+(e-s)/2;
			
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid]>x) {
				return search(arr,s,mid-1,x);
			}
			return search(arr,mid+1,e,x);
		}
		return -1;
	}

}
