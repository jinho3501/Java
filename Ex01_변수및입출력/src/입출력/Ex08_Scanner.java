package 입출력;

// import : 사용할 클래스의 위치를 나타냄
import java.util.Scanner;

public class Ex08_Scanner {

	public static void main(String[] args) {

		// Scanner 클래스
		// 입력 장치로부터 읽어들인 바이트를 문자, 정수, 실수 등 
		// 다양한 타입으로 변환화여 리턴하는 클래스
		
		// 입력받기 위해 사용하는 클래스
		// import를 통해서 다른 패키지에 있는 Scanner 클래스를 호출해야함!
		// Scanner클래스 위치 : JRE-java.base-java.util.Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		// 1. sc.next() : 문자열 입력받기
		// 2. = : 입력받은 문자열을 문자열 변수 name에 저장
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println(name);
		
		// 문자열에서 띄어쓰기까지 입력받기
		System.out.print("과정명을 입력하세요 : ");
		String className = sc.nextLine();
		System.out.println(className);
		
		// 숫자 입력받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age);

	}

}
