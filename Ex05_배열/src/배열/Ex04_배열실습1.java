package 배열;

public class Ex04_배열실습1 {
	
	public static void main(String[] args) {
		
		// 1. 문자열 데이터를 담을 수 있는 레퍼런스 변수(배열) strName을 선언
		String[] strName;
		
		// 2. 문자열 10개를 담을 배열을 생성(new)
		strName = new String[10];
		
		// 3. strName배열에 과목명으로 초기화(인덱스)
		strName[0] = "Java";
		strName[1] = "DB";
		strName[2] = "Python";
		strName[3] = "Crawling";
		strName[4] = "ML";
		
		// 4. strName에 들어있는 값 조회(반복문 활용)(인덱스)
		for(int i=0; i<strName.length; i++) {
			System.out.println(strName[i]);
		}
		
		// 5. DB가 몇 번째 방(인덱스)에 있는지 출력
		for(int i=0; i<strName.length; i++) {
			if("DB".equals(strName[i]) ) {
				System.out.println(i+"번째 방에 있습니다.");
			}
		}
		
	}

}
