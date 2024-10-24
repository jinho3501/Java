package while문;

import java.util.Scanner;

public class Ex05_다이어트프로그램 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1; // 몇 주차인지 나타낼 변수
		
		while(now > goal) {
			System.out.print(week++ +"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			now = now - minus; // now -= minus
		}
		
		System.out.println(now+"kg 달성~! 축하합니다!");
		
	
	}

}
