package 입출력;

public class Ex07_키코드읽기 {

	public static void main(String[] args) throws Exception{

		// 키보드에 입력한 키코드 가져오기
		// 정수형 변수 keyCode에 대입
		System.out.print("키보드에 입력하세요 : ");
		int keyCode = System.in.read();
		System.out.println(keyCode);
		
		// 2개이상의 키코드는 불가 
		// -> 여러 문자, 숫자 등을 입력받기 위해 Scanner 클래스 사용
	}

}
