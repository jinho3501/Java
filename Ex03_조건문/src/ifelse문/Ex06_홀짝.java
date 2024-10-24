package ifelse문;

import java.util.Scanner;

public class Ex06_홀짝 {
	public static void main(String[] args) {
		
		// 홀수인지 짝수인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 숫자를 2로 나누었을 때 나머지가 0, 1인지에 따라 홀짝
		if(num%2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
	}
}
