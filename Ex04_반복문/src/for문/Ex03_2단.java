package for문;

import java.util.Scanner;

public class Ex03_2단 {
	
	public static void main(String[] args) {
		
		// 2단
		System.out.println("출력문으로 구구단 작성");
		System.out.println(2+"*"+1+"="+2*1);
		System.out.println(2+"*"+2+"="+2*2);
		System.out.println(2+"*"+3+"="+2*3);
		System.out.println(2+"*"+4+"="+2*4);
		System.out.println(2+"*"+9+"="+2*9);
		
		// for문
		// 반복되는 구문, 변하는 구문을 체크
		// 변하는 구문들은 어떤 규칙을 가지고 있는지 확인 -> 1~9까지 1씩 증가하는 숫자
		System.out.println("for문으로 구구단 작성");
		for(int i=1; i<=9; i++) {
			System.out.println(2+"*"+i+"="+2*i);
		}
		
		
		// 단 수와 곱해지는 수를 입력받아서 구구단 작성
		System.out.println("입력받아서 구구단 작성");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("범위 입력 : ");
		int num2 = sc.nextInt();
		
		// 1~범위까지 곱해지는 구구단 -> 9대신에 입력받은 범위 숫자
		// 단의 수는 입력받은 숫자 형태로 진행 -> 2단 대신에 입력받은 단 숫자로 변경
		for(int i=1; i<=num2; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
		
	}

}
