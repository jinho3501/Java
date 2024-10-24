package while문;

import java.util.Scanner;

public class Ex02_10이상종료 {
	
	public static void main(String[] args) {
		
		// 문제. 숫자를 반복해서 입력받고 10이상을 입력받으면 프로그램 종료
		// while, do-while, while(break) 3가지 방법으로 풀이
		
		Scanner sc = new Scanner(System.in);
		
		// 1. while
		System.out.println("--while문--");
		
		int num = 0; // 입력받은 숫자를 담아줄 정수형 변수
		
		while(num<10) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료");
		
		// 2. do-while
		System.out.println("--do-while문--");
		
		num = 0;
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
		}while(num<10);
		System.out.println("종료");
		
		// 3. while(무한반복)
		System.out.println("--while문(무한반복)--");
		num = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num>=10) break;
		}
		System.out.println("종료");
		
	}
	

}
