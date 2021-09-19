package week1day2;

public class Find2ndLargestNumber {
	
	public static int secondLargest(int [] a, int length) {
		
		Arrays.sort(a);
		return a [length-1];
	}

	public static void main(String[] args) {
		
		int [] a= {35,65,23,56,78};
		System.out.println("Second Largest Number is " + secondLargest(a, 5));
	}

}
