package 메소드;

import java.util.Random;
import java.util.Scanner;

public class Ex01_메소드기본구조 {
	
	// main 메소드 : 코드를 실행하기 위한 메소드
	public static void main(String[] args) {
		
		// 메소드의 기본 구조
//		접근제한자 리턴타입 메소드이름(매개변수) {
//			실행할 코드;
//			return 반환할 값;
//		}
		
		// 1. 접근제한자 : 메소드에 접근할 수 있는 권한
		// - public : 모든 접근을 허용
		// - protected : 같은 package에 있는 객체와 상속 관계에 있는 객체들만 허용
		// - defalut : 같은 package에 있는 객체들만 허용
		// - private : 현재 객체 내에서만 허용
		
		// 2. 리턴타입 : 결과값의 데이터 타입
		// - 타입을 지정한 경우 return키워드가 필수
		// - 결과값이 없을 경우에는 void키워드 사용
		// - void키워드 사용할 경우 return키워드 사용 불가
		
		// 3. 메소드이름 : 메소드를 호출할 이름
		
		// 4. 매개변수 : 메소드를 실행할 때 필요한 값을 전달하는 변수
		
		// 5. () : 메소드 기호
		
		// 6. return : 실제 반환할 값을 나타내는 키워드
		
		// 생성한 addNum메소드 호출
		addNum(1,2); // 3
		
		System.out.println("addNum : "+addNum(1, 2));
		System.out.println("addNum+2 : "+(addNum(1, 2)+2));
		
		Random r = new Random();
		r.nextInt();
		
		Math.random();
		
	} // main메소드 끝
	
	// 메소드 내에는 메소드 생성 불가
	// 정수를 2개 받아서 덧셈의 결과를 반환해주는 메소드
	public static int addNum(int num1, int num2) {
		return num1+num2;
	}
	

} // class 끝





