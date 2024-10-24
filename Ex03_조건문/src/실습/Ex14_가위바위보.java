package 실습;

import java.util.Scanner;

public class Ex14_가위바위보 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 유저이름 입력받기
		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user2 : ");
		String user2 = sc.next();
		
		// 2. 유저의 가위바위보 입력받기
		System.out.print(user1+"님 : ");
		String rsp1 = sc.next();
		System.out.print(user2+"님 : ");
		String rsp2 = sc.next();
		
		// 문자열은 기본데이터타입이 아니기 때문에 ==(비교연산자)로 사용 불가능
		// 문자열.equals("비교할문자열")
		
		// 3. 가위바위보 결과 출력(기준 user1)
		// 3-1. 무승부일 때 
		if(rsp1.equals(rsp2)) {
			System.out.println("무승부!");
		}
		
		// 3-2. user1이 가위를 냈을 때
		else if(rsp1.equals("가위")) {
			// user2가 보를 내야 user1이 승리
			if(rsp2.equals("보"))
				System.out.println(user1+"의 승리!");
			else 
				System.out.println(user2+"의 승리!");
		}
		
		// 3-3. user1이 바위를 냈을 때
		else if(rsp1.equals("바위")) {
			// user2가 가위를 내야 user1이 승리
			if(rsp2.equals("가위"))
				System.out.println(user1+"의 승리!");
			else 
				System.out.println(user2+"의 승리!");
		}
		
		// 3-4. user1이 보를 냈을 때
		else if(rsp1.equals("보")) {
			// user2가 바위를 내야 user1이 승리
			if(rsp2.equals("바위"))
				System.out.println(user1+"의 승리!");
			else 
				System.out.println(user2+"의 승리!");
		}
		
		// 3-5. 다른것을 냈을 때
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
