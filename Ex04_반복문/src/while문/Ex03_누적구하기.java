package while문;

import java.util.Scanner;

public class Ex03_누적구하기 {
	
	public static void main(String[] args) {
		
		// 입력받기 위해 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--while문--");
		
		// 조건 : 입력받은 숫자가 -1이면 프로그램 종료
		
		int num=0; // 입력받은 숫자가 들어갈 변수
		int sum=0; // 누적의 결과가 들어갈 변수
		
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num; //sum = sum+num;  
		}
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료!");
		
		System.out.println("--do-while문--");
		
		num = 0;
		sum = 0;
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num; //sum = sum+num;  
		}while(num != -1);
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료!");
		
		System.out.println("--while문(true, break)--");
		num = 0;
		sum = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num; //sum = sum+num;  
			
			if(num == -1) {
				break;
			}
		}
		System.out.println("누적결과 : "+(sum+1));
		System.out.println("종료!");
			
		
	}
	
	

}
