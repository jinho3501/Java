package 산술연산자;

import java.util.Scanner;

public class Ex03_일의자리1로바꾸기 {

	public static void main(String[] args) {
		// 문제. num을 입력받아서 일의자리를 1로 바꾸는 프로그램 작성
		
		// 1. 입력받기위해 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수를 입력받아서 변수에 저장
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. 나머지나 몫을 활용해서 일의자리 바꾸기
		int result = (num/10)*10+1;

		// 4. 출력하기
		System.out.println("결과 : "+result);

	}

}
