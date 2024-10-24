package for문;

import java.util.Iterator;
import java.util.Scanner;

public class E02_for문예제 {
	
	public static void main(String[] args) {
		int i =0;
		
//		// 21~57까지 출력
//		for(i=21; i<=57; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		// 96~53까지 출력
//		for(i=96; i>=53; i--) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		// 21~57까지 홀수만(조건) 출력
//		for(i=21; i<=57; i++) {
//			if(i%2==1)
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력받아서 1부터 입력받은 정수까지 차례대로 출력
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		for(int j=1; j<=num1; j++) {
//			System.out.print(j+" ");
//		}
		
//		// 두 개의 정수를 입력받아서 작은수부터 큰수까지 차례대로 출력
//		System.out.print("정수1 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		int num3 = sc.nextInt();
//		
//		// num2, num3중에 어떤 숫자가 큰 숫자인지 확인
//		int min ; // 작은수
//		int max ; // 큰수
//		
//		if(num2<num3) {
//			min = num2; 
//			max = num3;
//		}else {
//			min = num3;
//			max = num2;
//		}
//		
//		for(int j=min; j<=max; j++) {
//			System.out.print(j+" ");
//		}
//		
//		// 두 개의 정수를 입력받아서 작은수부터 큰수까지 차례대로 출력
//        int n1 = sc.nextInt(), n2 = sc.nextInt();
//
//        int min = Integer.min(n1, n2);
//        int max = Integer.max(n1, n2);
//
//        for (int i = min; i <= max; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//		
//		
		
		// 숫자 2개를 입력 받아서 두 수 사이의 총합을 출력
		// ex) 2, 9입력 -> 2+3+4+5+6+7+8+9의 총합 출력
//		System.out.print("정수1 입력 : ");
//		int num4 = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		int num5 = sc.nextInt();
//		
//		int min = Integer.min(num4, num5); // 작은수
//		int max = Integer.max(num4, num5); // 큰수
//		
//		int sum = 0; // 총합
//		
//		for(int j=min; j<=max; j++) {
//			sum = sum + j; // sum+=j
//		}
//		System.out.println("총합 : "+sum);
		
		
		
		// 1~100까지의 3의 배수(조건)를 출력
		for(int j=1; j<=100; j++) {
			if(j%3==0) {
				System.out.print(j+" ");
			}
		}
		
		// 1~100까지의 3의 배수의 합을 출력
		System.out.println();
		int sum = 0;
		
		for(int j=1; j<=100; j++) {
			if(j%3==0) {
				sum = sum + j;
			}
		}
		System.out.println("sum : "+sum);
		
		// 두번째 방법
		int sum2 = 0;
        for (int k = 3; k <= 100; k += 3) {
            sum2 += k;
        }
        System.out.println(sum2);

		
		// 정수를 입력받아 그 수의 배수를 차례로 10개 출력
        System.out.print("정수입력 : ");
        int num6 = sc.nextInt();
        
        for(int j=1; j<=10; j++) {
        	System.out.print(num6*j+" ");
        }
        
		
	}

}
