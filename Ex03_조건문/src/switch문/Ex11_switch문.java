package switch문;

import java.util.Scanner;

public class Ex11_switch문 {
	
	public static void main(String[] args) {
		// switch문 : (입력값)과 case 뒤에오는 값을 비교
		// 비교할 값에는 연산식, 변수 사용X
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A, B, C 중 하나를 입력 : ");
		String str = sc.next();
		
		// break문 : 조건문이나 반복문에서 "탈출"하는 키워드
		// break를 걸지 않으면, switch문에서는 break를 만날 때까지 실행문장들을 실행
		
		switch (str) {
		case "A": System.out.println("A"); break; 
		case "B": System.out.println("B"); break;
		case "C": System.out.println("C"); break;
		default: System.out.println("다른 문자를 입력했습니다."); break;
		}
	}

}
