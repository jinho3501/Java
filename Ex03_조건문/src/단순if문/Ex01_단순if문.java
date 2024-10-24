package 단순if문;

public class Ex01_단순if문 {

	public static void main(String[] args) {
		// 조건문
		// 만약에, ~라면
		// 만약 조건식이 true라면, 실행문장을 실행하겠다.
		// 만약 조건식이 false라면, if다음실행문장을 실행하겠다.
//			if(조건식-true/false) {
//				실행문장;
//			}
//			if다음실행문장;
		
		if(true) {
			System.out.println("무조건 true");
		}
		
		// 실행문장이 1개일 경우에는 {} 중괄호 생략 가능
		if(true) 
			System.out.println("실행문장1개일때");

	}

}
