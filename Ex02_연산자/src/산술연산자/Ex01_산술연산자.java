package 산술연산자;

public class Ex01_산술연산자 {

	public static void main(String[] args) {
		// 문제. num1과 num2의 산술연산을 출력
		// (더하기, 빼기, 곱하기, 나누기, 나머지)
		// (나머지는 실수형태로 출력)
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("더하기 : "+(num1+num2));
		System.out.println("빼기 : "+(num1-num2));
		System.out.println("곱하기 : "+(num1*num2));
		System.out.println("몫 : "+(num1/num2));
		System.out.println("나머지 : "+(num1%num2));
		System.out.println("나누기 : "+((float)num1/num2));
		
	}

}
