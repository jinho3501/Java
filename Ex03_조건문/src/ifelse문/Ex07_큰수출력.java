package ifelse문;

import java.util.Scanner;

public class Ex07_큰수출력 {

	public static void main(String[] args) {
		// 문제. 숫자 2개를 입력받고 큰수를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) System.out.println("큰 수는 "+num1+"입니다.");
		else System.out.println("큰 수는 "+num2+"입니다.");
		
	}

}
