package 실습;

import java.util.Scanner;

public class Ex15_자판기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 자판기 ====");
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("[1] 콜라 800원 [2] 생수 500원 [3] 비타민워터 1500원 ");
		System.out.print("메뉴를 골라주세요 : ");
		int choice = sc.nextInt();
		
		// 콜라 선택
		if(choice == 1) {
			System.out.println("콜라를 선택하셨습니다.");
			if(money >= 800) {
				int remain = money - 800;
				System.out.println("잔돈 : "+remain);
				System.out.println("천원 : "+(remain/1000));
				System.out.println("오백원 : "+(remain%1000/500));
				System.out.println("백원 : "+(remain%1000%500/100));
			}
			else {
				System.out.println("돈이 부족합니다. ");	
			}
		}
		
		// 생수 선택
		else if(choice == 2) {
			
		}
		
		// 비타민워터 선택
		else if(choice == 3) {
			
		}
		
		else {
			System.out.println("잘못입력하셨습니다.");
		}
			
			
		
	}

}
