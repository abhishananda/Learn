package abhi.FunctionalInterface;

public class Test {

	public static void main(String[] args) {
		
//		MyInterface ref = (str) -> {
//			String result = "";
//			
//			for(int i = str.length()-1;i >=0;i--)
//				result += str.charAt(i);
//			
//			return result;
//		};
//		System.out.println("Lambda exp = "+ ref.reverse("Fuck you"));
		
		
		GenericInterface<String> reverse = (str) ->{
			String result = "";
			for(int i=str.length()-1;i>=0;i--)
				result += str.charAt(i);
			return result;
		};
		
		System.out.println("Lambda reversed = " + reverse.func("Lambda"));
		
		
		GenericInterface<Integer> factorial = (n) -> {
			int result =1;
			for(int i=1;i<=n;i++) {
				result = i*result;
			}
			return result;
		};
		System.out.println("factorial of 5 = "+factorial.func(5));
		
	}

}
