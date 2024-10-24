package ifelse문;

import java.util.Scanner;

public class Ex05_합격불합격 {

	public static void main(String[] args) {
		// 문제. 점수를 입력받아서 60점 이상이면 합격, 미만이면 불합격을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		
		// 합격 불합격을 판별
		if(grade>=60) System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");

	}

}
