package ifelse문;

import java.util.Scanner;

public class ㅇㅇ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---while문----");
		int num = 0;
		int sum = 0;
		int 
		while (num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if(num%2==0) 
		}
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료");

		System.out.println("---do-while문----");
		num = 0;
		sum = 0;
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num;
		} while (num != -1);
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료");

		System.out.println("---while문 무한반복 ----");
		num = 0;
		sum = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num;
			if (num == -1)
				break;
		}
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료");
	}

}
