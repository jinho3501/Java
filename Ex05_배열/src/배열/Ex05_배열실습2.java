package 배열;

import java.util.Random;

public class Ex05_배열실습2 {

	public static void main(String[] args) {
		// 정수형 데이터를 담을 수 있는 배열 array 선언
		int[] array;

		// 정수형 데이터 10개 담을 수 있도록 배열 생성
		array = new int[10];

		// 각각의 인덱스에 1~20까지의 랜덤수로 초기화
		Random r = new Random();
		
//		array[0] = r.nextInt(20)+1;
//		array[1] = r.nextInt(20)+1;
//		array[2] = r.nextInt(20)+1;
//		---
//		array[9] = r.nextInt(20)+1;
		
		for(int i=0; i<array.length; i++) {
			array[i] = r.nextInt(20)+1;
		}

		// 배열의 전체 값 출력
		System.out.print("array : ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();

		// 배열에 들어있는 데이터의 합 출력
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
			// sum += array[i]
		}
		System.out.println("sum : "+sum);
		
		// 배열 안에 들어있는 데이터의 평균 출력
		System.out.println("평균 : "+sum/array.length);

		// 배열 안에 들어있는 짝수만 출력
		System.out.print("짝수 : ");
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
	
	}
	
	

}
