package for문;

public class Ex01_for문 {
	
	public static void main(String[] args) {
		
		// 반복문
		// while문 : 반복횟수가 정해져있지 않을 때
		// for문 : 반복횟수가 정해져있을 때
		
		// 1~10까지 출력하세요.
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		// 1씩 증가할 값을 담아줄 변수 i 선언 및 초기화
		int i = 1;
		
		while(i<=10) {
			System.out.print(i++ +" ");
			// i += 1
		}
		
		// for문
//		for(초기화구문; 검사조건; 반복후작업) {
//			실행문장;
//		}
		
		// 초기화구문 : for문 안에서 사용할 지역변수를 초기화 하는 작업
		// 검사조건 : 반복문을 실행할지말지 결정하는 조건식 -> true/false
		// 실행문장 : 검사조건이 true일 때만 실행
		// 반복후작업 : 실행문장 실행 이후 변화 
		
		// 실행순서 : 1. 초기화구문 -> 2. 검사조건(t) -> 3. 실행문장 -> 4. 반복후작업
		//						   5. 검사조건(t) -> 6. 실행문장 -> 7. 반복후작업
		//						   8. 검사조건(f) -> 종료
	
		// 1~10까지 변하는 숫자를 담아줄 변수 -> 초기화 구문에 작성
		System.out.println();
		for(int num=1; num<=10; num++) {
			System.out.print(num);
		}
		
	}

}
