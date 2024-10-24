package 산술연산자;

import java.util.Scanner;

public class Ex04_합계평균 {
	
	public static void main(String[] args) {
		// 문제. 3개 과목의 점수를 입력받고 합계와 평균을 구하세요
		
		// 1. 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력하기 : ");
		int java = sc.nextInt();
		
		System.out.print("Python 점수 입력하기 : ");
		int python = sc.nextInt();
		
		System.out.print("Crawling 점수 입력하기 : ");
		int crawling = sc.nextInt();
		
		// 2. 합계와 평균
		int sum = java+python+crawling;
		int avg = sum/3;
		
		// 3. 출력하기
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
