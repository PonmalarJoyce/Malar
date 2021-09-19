package week1day2;

public class Calculator {
	
	public int add(int num1,int num2,int num3) {
		int num4=num1+num2+num3;
		return num4;
	}
	public int sub(int num1,int num2) {
		int num3=num1-num2;
		return num3;
	}
	public int mul(int num1,int num2) {
		int num3=num1*num2;
		return num3;
	}
	public int div(int num1,int num2) {
		int num3=num1/num2;
		return num3;
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(2, 4, 6));
		System.out.println(cal.sub(25,5));
		System.out.println(cal.mul(25,5));
		System.out.println(cal.div(25,5));

	}

}
