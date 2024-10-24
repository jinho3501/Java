package 메모리;

public class Ex01_Java변수 {
	
	// 1. class 영역에서 선언
	// 1-1. 클래스 변수/static변수 : 여러 곳에서 공유하고 싶을 때 사용
	static int a = 0;
	
	// 1-2. 인스턴스 변수 : 객체별로 다른 값을 저장
	int b = 1;
	
	public static void main(String[] args) {
		// 2. 메소드 영역에서 선언
		// 2-1. 지역 변수 : 메소드 내에서 선언이 되고 메소드 수행이 끝나면 자동 소멸
		int c = 1;
		
		// 2-2. 매개변수 : 메소드를 호출 할 때 전달하는 값
	}

}
