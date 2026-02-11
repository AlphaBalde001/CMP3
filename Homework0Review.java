
//import java.util.Arrays;

public class Homework0Review {

	
	public static double getRectangleArea(double Length, double Width) { //1
		
		if(Length <= -1 || Width <= -1) {
			
			return -1.0;
		}
		else {
			
		
		double Area = Length * Width;
		
		return Area;
		}
		
		}
		
		public static int sum(int n) { //2
			
			if(n >= 1) {
				int sum = (n*(n+1))/2;
				return sum;
			}
				return 0;
			
		
		
	}
		
		public static double getCircleArea(double radius) { //3
			
			if(radius <= 0) {
				return 0.0;
			}
			double Area = Math.PI * Math.pow(radius, 2);
			return Area;
		}
		
		public static String getBinaryFromDecimal(int n) { //4
			if(n < 0 ) {
				return null;
			}
			if(n == 0) {
				return "0";
			}
			
			String binary = "";
		while(n>0) {
			int remainder = n%2;
			binary = remainder + binary;
			n=n/2;
		
			}
		return binary;
		}
		
		public static int linearSearch(int[] arr, int key) { //5
			
			if(arr == null) {
				return -1;
			}
			for(int i = 0; i< arr.length; i++) {
				if(arr[i] == key) {
					return i;
				}
				
			}
			return -1;
		}
		
		public static void squareNums(int[] arr) { //6
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * arr[i];
			}
		}
		
		public static int sum(int[] arr) { //7
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				
				sum = sum + arr[i];
				
			}
			return sum;
		}
		
		public static int factorial(int n) { //8
			if(n < 0) {
				return -1;
			}
			int result = 1;
			
			for(int i = 1; i <=n; i++) {
				result = result * i;
				
			}
			return result;
			
			
		}
		
		public static void shuffle(String[] arr, int index) { //9 review with professor
			
		}
		
		
		
	public static void main(String[] args) { 
		int[] numbers = {1,2,3,4,5};
        sum(numbers);
     //   System.out.println( Arrays.toString(numbers));
      //  System.out.println(sum(numbers));
        System.out.println(factorial(5)); 
	}

}



