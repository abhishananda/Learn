import java.util.Scanner;

public class PythegoreanTriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

	    int a=scn.nextInt();
	    int b=scn.nextInt();
	    int c=scn.nextInt();
	    
	    if(a==Math.sqrt((b*b)+(c*c))){
	      System.out.println(true);
	    }
	    else{
	      System.out.println(false);
	    }
	}

}
