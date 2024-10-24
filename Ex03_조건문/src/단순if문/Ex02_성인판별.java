package 단순if문;

import java.util.Scanner;

public class Ex02_성인판별 {

	public static void main(String[] args) {
		// 문제. 나이를 입력받고 나이가 20 이상이면 "성인입니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		
		System.out.println("프로그램 종료");

	}

}
