package 산술연산자;

import java.util.Scanner;

public class Ex02_백의자리버리기 {

	public static void main(String[] args) {
		// num을 입력받아서 백의자리 아래를 버리는 프로그램
		
		// 1. 입력받기 위해서 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수 입력받아서 나중에 연산하기 위해 변수에 저장
		int num = sc.nextInt();
		
		// 3. 백의자리 아래 버리는 연산
		// 3-1. 나머지를 구해서 num에서 빼기
		int result = num-(num%100);
		
		// 3-2. 몫을 구해서 100을 곱해주기
		int result2 = (num/100)*100;
		
		// 4. 출력하기
		System.out.println("결과1 : "+result);
		System.out.println("결과2 : "+result2);

	}

}
