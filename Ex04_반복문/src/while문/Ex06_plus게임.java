package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex06_plus게임 {
	
	public static void main(String[] args) {
		
		// 1. 필요한 도구들 불러오기
		// Ctrl+Shift+O : 전체 자동 import
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("==Plus Game==");
		
		// 틀린 횟수, 맞춘 횟수 저장할 변수
		int success = 0;
		int fail = 0;
		
		while(true) {
			
			// 랜덤 숫자 2개 가져오기
			int ran1 = r.nextInt(10)+1;
			int ran2 = r.nextInt(10)+1;
			
			// 랜덤 숫자 출력 (4+8=)
			System.out.print(ran1+"+"+ran2+"=");
			
			// 답 입력받기
			int answer = sc.nextInt();
			
			// 문제 정답 확인
			if(answer == (ran1+ran2)) {
				success++;
				System.out.println("success!");
			}
			else {
				fail++;
				System.out.println("fail!");
			}
			
			// 게임 진행 여부 파악
			System.out.print("계속 진행하시겠습니까?");
			String answer2 = sc.next();
			if(answer2.equals("N")) break;
		}
		System.out.println("게임이 종료되었습니다.");
		System.out.println("success : "+success);
		System.out.println("fail : "+fail);
		
	}

}
