package 변수;

public class Ex03_변수명규칙 {

	public static void main(String[] args) {

		// 1. 예약어(키워드)는 변수명 불가
		int class = 0;
		
		// 2. 대소문자 구분
		int a = 0;
		int A = 0;
		
		// 3. 숫자로 시작 불가
		int 3a = 1;
		
		// 4. 특수문자는 '_'와 '$'만 사용 가능
		int a_1 = 0;
		int a_# = 0; 
		
		// 5. 길이의 제한 X
		int nummmmmmmmmmmmmmmmmmmmmmmmmmmm = 0;
		
		// 6. 한글 사용 가능(권장X)
		int 키 = 123;
		
		// 7. 띄어쓰기 불가능
		int num age = 5;
		
		// 클래스명은 대문자로 시작
		// 메소드, 변수명은 소문자로 시작
		// 상수는 대문자로 작성
		
		// 표기법
		// 카멜 표기법 : 맨 앞글자를 제외한 단어는 대문자로 시작
		String backgroundColor = "pink";
		
		// 파스칼 표기법 : 단어의 앞글자를 대문자로
		String BackgroundColor = "yellow";
		
		// 스네이크 표기법 : 단어 사이에 언더바 사용
		String background_color = "green";
		
		// 헝가리안 표기법 : 자료형을 단어 앞에 표시
		String strBackgroundColor = "blue";
		

	}

}
