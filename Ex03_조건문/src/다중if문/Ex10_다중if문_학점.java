package 다중if문;

import java.util.Scanner;

public class Ex10_다중if문_학점 {
	
	public static void main(String[] args) {
		// 점수를 입력하면 학점을 출력
		// A, B, C, D
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String result; 
		
		if(score>=90) {
			result ="A";
		}else if(score >=80 && score <90) {
			result = "B";
		}else if(score >=70 && score <80) {
			result = "C";
		}else {
			result ="D";
		}
		
		System.out.println(result+"학점입니다!");
		
	}

}
