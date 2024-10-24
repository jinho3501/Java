package ifelse문;

import java.util.Scanner;

public class Ex09_마트계산대 {
	
	public static void main(String[] args) {
	
		// 문제. 만원짜리 추석선물셋트를 구입했을 때 지불해야하는 금액 계산
		// 단, 11개 이상 구매시에는 10% 할인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개 구매하실건가요? ");
		int num = sc.nextInt();
		
		int money = 0;
		
		if(num<11) {
			money = num*10000;
		}else {
			money = (int)(num*10000*0.9);
		}
		
		System.out.println("가격은 "+money+"입니다.");
		
	}

}
