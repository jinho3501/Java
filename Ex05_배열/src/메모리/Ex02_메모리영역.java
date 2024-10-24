package 메모리;

public class Ex02_메모리영역 {
	
	// 1. Method/Static 영역에 저장
	static int s = 10;
	
	// 2. Method/Static 영역에 저장
	// Ex02클래스 내에 저장
	int i = 0;
	
	// 3. Method/Static 영역에 저장
	// Ex02클래스 내에 저장
	public static void main(String[] args) {
		
		// 4. Stack영역에 저장
		int num1 = 1;
		int num2 = 2;
		int result = num1+num2+Ex02_메모리영역.s;
		
		// 5. Stack영역에는 heap영역의 주소값만 저장
		//    실제 값은 heap 영역에 저장
		int[] array = new int[4];
	}
	
	// Method영역(Static)
//	- 인스턴스 변수, static변수, 상수 등을 저장하는 공간
//	- Static영역에 있는 변수는 어디서든 사용 가능
//	- Static영역의 데이터는 프로그램 시작~종료까지 메모리에 남아있음
//	- 무분별하게 사용할 경우 메모리 부족 현상 발생
	
	// Stack영역
//	- 메소드 내에서 정의하는 기본 자료형에 해당되는 지역 변수의 데이터들이 저장되는 공간
//	- 메소드가 종료되면 자동으로 메모리에서 소멸
	
	// Heap영역
//	- Reference Type(참조형) 데이터를 갖는 객체, 배열 등이 저장되는 공간

}















