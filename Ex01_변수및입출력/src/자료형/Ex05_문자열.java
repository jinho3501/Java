package 자료형;

public class Ex05_문자열 {

	public static void main(String[] args) {

		// 문자열 : 문자의 연속된 나열
		// String 클래스 사용 -> 문자 여러개를 저장하기 위한 타입/ ""사용
		
		//char name = '박수현';
		String name1 = "박수현";
		
		// 덧셈(+)연산자를 사용하면 문자열 결합 가능
		// 문자+문자 = 문자
		String language = "Ja"+"va";
		System.out.println(language);
		
		// 문자+숫자 = 문자
		System.out.println("7"+7);
		
		// 숫자+문자 = 문자
		System.out.println(7+"7");
	}

}
