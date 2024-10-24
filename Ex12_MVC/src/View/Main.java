package View;

import java.util.Scanner;

import Controller.Controller;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();

		System.out.println("== 회원관리시스템 ==");

		while (true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("==회원가입==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				System.out.print("NAME : ");
				String name = sc.next();
			
				String result = con.joinCon(id, pw, age, name);
				
				System.out.println("회원가입에 "+result+"했습니다.");
				
			}
			else if(menu == 2) {
				System.out.println("==로그인==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				
				String name = con.loginCon(id, pw);
				
				if(name != null) {
					System.out.println(name+"님 로그인에 성공하셨습니다.");
				}else {
					System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
				}
			}

		}

		

	}
}
