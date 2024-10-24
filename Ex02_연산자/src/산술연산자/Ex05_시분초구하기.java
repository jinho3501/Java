package 산술연산자;

import java.util.Scanner;

public class Ex05_시분초구하기 {
	
	public static void main(String[] args) {
		
		// 시분초 구하기 프로그램
		
		// 입력받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int time = sc.nextInt();
		
		// 시분초로 나누기
		int h = time/3600;
		int m = time%3600/60;
		int s = time%3600%60;
		
		System.out.println(h+"시간 "+m+"분 "+s+"초");
		
	
	}

}
