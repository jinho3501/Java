package while문;

public class Ex01_while문 {
	
	public static void main(String[] args) {
		
		// 반복문 : 어떤 조건에 만족할 때까지 같은 처리를 반복해서 실행하는 구조
		
		// 1~10까지 출력하세요.
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		// 1. while문/do-while문 : 반복횟수가 정해지지 않은 경우(특정 조건에 해당할 때만)
		// 2. for문 : 반복횟수가 정해진 경우
		
		// 1씩 증가할 숫자를 담아줄 정수형 변수
		int num = 1;
		
		while(num<6) {
			System.out.print(num++);
		}
		System.out.println();
		// ------------------------------------------
		int num1 = 0;
		while(num1<5) {
			System.out.print(++num1);
		}
		// ------------------------------------------
		
		System.out.println();
		int num2 = 1;
		
		// 조건식에 true를 작성하면 무한반복
		while(true) {
			System.out.print(num2++);
			if(num2>5) {
				break;
			}
		}
		System.out.println();
		// do-while문 : 무조건 1번은 실행을 해야할 때
		int num3 = 1;
	
		do {
			System.out.print(num3++);
		}while(num3<6);
		
	}

}
