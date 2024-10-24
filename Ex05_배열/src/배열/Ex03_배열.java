package 배열;

import java.util.Arrays;

public class Ex03_배열 {
	
	public static void main(String[] args) {
		
		// 1. 배열 생성
		// new키워드 사용할 때 배열 생성
		// 레퍼런스 변수를 선언해야 배열값에 접근 가능
		int[] arr = new int[5];
		String[] arr2 = new String[4];
		
		// 2. 배열에 값 추가 -> 인덱스 번호 활용
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 반복문
		for(int i=0; i<=4; i++) {
			arr[i] = i;
		}
		
		// 3. 배열에 저장된 값 조회 -> 인덱스 번호 활용
		System.out.println("arr[2] : "+arr[2]);
		
		// 전체 배열의 값 조회 -> for문 활용
		for(int i=0; i<=4; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		// heap영역에 저장된 주소값
		System.out.println(arr);
		
		// 4. 배열의 크기
		System.out.println("arr의 크기 : "+arr.length);
		
		// 5. 배열에 저장되어야할 값을 알고 있을 때
		int[] arr3 = {4,5,3,6,9};
 		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		// 6. 주소값 공유
		int[] arr4 = arr3; // arr3의 주소값을 arr4가 공유
		
		System.out.println();
		System.out.println("arr3[1] : "+arr3[1]); // 5
		System.out.println("arr4[1] : "+arr4[1]); // 5
		
		arr3[1] = 0;
		System.out.println("arr3[1] : "+arr3[1]); // 0
		System.out.println("arr4[1] : "+arr4[1]); // 0
		
		// ----------------------
		
		System.out.println("arr4[3] : "+arr4[3]); // 6
		System.out.println("arr3[3] : "+arr3[3]); // 6
		
		arr4[3] = 0;
		
		System.out.println("arr4[3] : "+arr4[3]); // 0
		System.out.println("arr3[3] : "+arr3[3]); // 0
		
		
		// 7. toString() : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
