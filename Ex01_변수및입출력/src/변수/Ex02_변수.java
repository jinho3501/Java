package 변수;

public class Ex02_변수 {

	public static void main(String[] args) {
		
		// 변수 : 데이터를 담을 수 있는 메모리의 공간
		
		// 1. 변수 선언 : 메모리에 데이터를 담을 수 있는 공간 확보, 값X
		// 변수타입(자료형, 형) 변수명;
		// 변수타입 : 저장하고 하는 값의 타입을 지정
		// 변수명 : 메모리 공간에 이름을 붙이는 것
		int age;
		String name;
		
		// 2. 변수 초기화 : 변수에 처음으로 값을 저장하는 것
		// = 연사자(대입) : 오른쪽에 있는 값을 왼쪽에 대입하는 것
		age = 1;
		name = "박수현";
		
		// 선언과 초기화 한번에
		int num = 1;
		
		// 3. 재할당 : 현재 변수의 값을 버리고 새로운 값을 저장하는 것
		age = 4;
		
		// 4. 상수 : 변하지 않는 수(final 키워드 사용)
		final int studentCode = 217102;
		
		// 상수는 재할당 불가능
		// studentCode = 1234;
		
		// 치환
		// 두 변수의 값을 바꾸려면?
		int num1 = 1;
		int num2 = 2;
		
		// syso+Ctrl+space 출력코드
		System.out.println("치환 전 num1 : "+num1);
		System.out.println("치환 전 num2 : "+num2);
		
		// 실행 : Ctrl+F11
		
		// 데이터를 임시로 저장할 변수 선언
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("치환 후 num1 : "+num1);
		System.out.println("치환 후 num2 : "+num2);
		
		
	}

}
