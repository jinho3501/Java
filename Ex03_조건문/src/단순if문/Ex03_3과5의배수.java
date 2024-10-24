package 단순if문;

import java.util.Scanner;

public class Ex03_3과5의배수 {

	public static void main(String[] args) {
		// 문제. 숫자를 입력받고 3의배수이면서 5의배수일 때 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}
		
		System.out.println("프로그램 종료");

	}

}
