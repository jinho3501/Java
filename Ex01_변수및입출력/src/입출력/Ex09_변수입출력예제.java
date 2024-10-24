package 입출력;

import java.util.Scanner;

public class Ex09_변수입출력예제 {

	public static void main(String[] args) {
		// 문제. 이름(문자열), 주소(문자열) - 띄어쓰기 포함, 호수(정수)를 입력받고 출력하기
		
		// 1. 입력받기 위해 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 입력받고 변수에 저장
		System.out.print("이름 : ");
		String name = sc.next();
		
		// sc.next()를 사용하고나면 "박수현"+Enter
		// 입력한 문자열만 가지고오고 Enter는 남아있는 상태
		// sc.nextLine()을 만났을 때 Enter가 남아있어서
		// 실행 완료가 되어 다음 실행코드를 실행
		
		System.out.print("주소 : ");
		sc.nextLine(); // 남아있는 Enter를 처리하는 역할
		String address = sc.nextLine();
		
		System.out.print("호수 : ");
		int room = sc.nextInt();
		
		// 3. 변수안에 있는 값을 출력
		System.out.print("이름 : "+name);
		System.out.print(", 주소 : "+address);
		System.out.print(", 호수 : "+room);
		

	}

}
