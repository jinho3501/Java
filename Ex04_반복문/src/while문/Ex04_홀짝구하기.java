package while문;

import java.util.Scanner;

public class Ex04_홀짝구하기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--while문--");
		
		int num = 0; // 입력받은 숫자를 담아줄 변수
		int odd = 0; // 홀수의 개수를 담아줄 변수
		int even = 0; // 짝수의 개수를 담아줄 변수
		
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			// num이 홀수인지 짝수인지
			if(num%2==0) even++;
			else odd++;
		}
		
		System.out.println("홀수 :"+(odd-1));
		System.out.println("짝수 :"+even);
		System.out.println("종료");
		
		System.out.println("--do-while문--");
		num = 0; // 입력받은 숫자를 담아줄 변수
		odd = 0; // 홀수의 개수를 담아줄 변수
		even = 0; // 짝수의 개수를 담아줄 변수
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			// num이 홀수인지 짝수인지
			if(num%2==0) even++;
			else odd++;
		}while(num != -1);
		System.out.println("홀수 :"+(odd-1));
		System.out.println("짝수 :"+even);
		System.out.println("종료");
		
		System.out.println("--while문(true, break)--");
		num = 0; // 입력받은 숫자를 담아줄 변수
		odd = 0; // 홀수의 개수를 담아줄 변수
		even = 0; // 짝수의 개수를 담아줄 변수
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			// num이 홀수인지 짝수인지
			if(num%2==0) even++;
			else odd++;
			
			// 반복문을 탈출해줄 조건문 필요
			if(num == -1) break;
		}
		System.out.println("홀수 :"+(odd-1));
		System.out.println("짝수 :"+even);
		System.out.println("종료");
		
		
	}

}
