package while문;

import java.util.Scanner;

public class Ex05_로그인프로그램 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("==로그인 프로그램==");
		
		while(true) {
			// 아이디와 비밀번호 입력받기
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			// 로그인 판단
			if(id.equals("lgedx") && pw.equals("1234")) {
				System.out.println("로그인 성공");
				break; // break를 기준으로 했을 때 가장 가까운 조건문/반복문을 탈출
			}else {
				System.out.println("로그인 실패");
			}
			
		} System.out.println("종료");
		
	}

}
