package 삼항연산자;

import java.util.Scanner;

public class Ex06_큰수에서작은수빼기 {

	public static void main(String[] args) {
		// 문제. 두 수를 입력받아서 큰수에서 작은수를 뺀 결과를 출력하세요
		
		// 1. 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		// 2. 큰수를 찾아서 큰수-작은수(삼항연산자)
		// 삼항연산자 : (조건식) ? (참일때 실행) : (거짓일때 실행)
		int result = num1<num2 ? num2-num1 : num1-num2;
		
		// 3. 출력
		System.out.println("두 수의 차 : "+result);

	}

}
