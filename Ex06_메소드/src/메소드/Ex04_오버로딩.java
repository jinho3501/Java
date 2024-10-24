package 메소드;

public class Ex04_오버로딩 {
	
	public static void main(String[] args) {
		
		// 오버로딩 : 중복정의
		// 오버라이딩 : 재정의
		
		// 오버로딩 : 메소드의 이름은 1개이지만, 매개변수를 다르게해서 메소드를 여러개 만드는 기법
		//   	  : 같은 이름의 메소드를 '중복'해서 '정의'하는 것
		//    조건1. 메소드의 이름이 같다.
		// 	  조건2. 매개변수의 타입/개수가 다르다.
		
		// 가장 쉽게 볼 수 있는 오버로딩
		// print 메소드는 하나의 이름으로 여러개 기능, 매개변수 타입이 다 다르다.
		// 오버로딩을 함으로써 사용자의 편의성을 높여준다!
		//System.out.printString("");
		//System.out.printInt(6);
		
		System.out.print("");
		System.out.print(6);
		System.out.println();
		
		System.out.println("addNum정수 : "+addNum(1,2));
		System.out.println("addNum실수 : "+addNum(1.1,2.1));
		System.out.println("addNum정수3 : "+addNum(1,2,3));
	}
	
	public static int addNum(int num1, int num2) {
		return num1+num2;
	}
	
	public static double addNum(double num1, double num2) {
		return num1+num2;
	}
	
	public static int addNum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

}
