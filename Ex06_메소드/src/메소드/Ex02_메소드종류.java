package 메소드;

public class Ex02_메소드종류 {
	
	public static void main(String[] args) {
		
		System.out.println("addNum1 : "+addNum1(1, 2));
		addNum2(1, 2); // 반환값이 없고 실행문장 내에 출력코드가 있기때문에 호출만해도 출력
		System.out.println("addNum3 : "+addNum3());
		apple();
		
	}
	
	// 매개변수 O, 반환값 O
	// 정수 2개(매개변수)를 받아서 덧셈(실행문장)의 결과를 반환(return)해주는 메소드
	public static int addNum1(int num1, int num2) {
		int result = num1+num2;
		
		return result;
	}
	
	// 매개변수 O, 반환값 X
	// 정수 2개(매개변수)를 받아서 덧셈의 결과를 출력(실행문장)해주는 메소드
	public static void addNum2(int num1, int num2) {
		// 1. 덧셈
		int result = num1+num2;
		
		// 2. 결과를 출력
		System.out.println("addNum2 : "+result);
	}
	
	// 매개변수 X, 반환값 O
	// 1과 2를 더해서 결과값을 반환해주는 메소드
	public static int addNum3() {
		return 1+2;
	}
	
	// 매개변수X, 반환값 X
	// "사과"를 출력하는 메소드
	public static void apple() {
		System.out.println("사과");
	}
	
	
	
	
	
	

}
