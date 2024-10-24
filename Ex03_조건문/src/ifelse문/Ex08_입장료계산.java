package ifelse문;

import java.util.Scanner;

public class Ex08_입장료계산 {
	public static void main(String[] args) {
		
		// 문제. 입장료 계산 프로그램
		// 기본료 : 5000원
		// 미성년자인 경우에는 50%할인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		// 조건 : 미성년자일 때 아닐 때
		// 특정 영역 내에서 선언되었을 경우 지역변수
		
		int money = 0; // 전역변수로 선언 및 초기화
		
		if(age<=20) {
			money = (int)(num*5000*0.5); // 조건에 따라서 값을 재할당
		}else {
			money = num*5000; // 조건에 따라서 값을 재할당
		}
		
		System.out.println("입장료는 "+money+"입니다.");
		
	}

}
