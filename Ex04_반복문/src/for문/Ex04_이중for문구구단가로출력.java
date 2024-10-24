package for문;

public class Ex04_이중for문구구단가로출력 {
	
	public static void main(String[] args) {
	
//		System.out.print("2단 : ");
//		System.out.print(2+"*"+1+"="+2*1+"\t");
//		System.out.print(2+"*"+2+"="+2*2+"\t");
//		System.out.print(2+"*"+3+"="+2*3+"\t");
//		System.out.print(2+"*"+4+"="+2*4+"\t");
		
		// for문
//		System.out.print("2단 : ");
//		// i : 범위를 의미하는 변수(1~9까지 1씩 증가하는 숫자)
//		for(int i=1; i<=9; i++) {
//			System.out.print(2+"*"+i+"="+2*i+"\t");
//		} System.out.println();
//	
//		
//		// 3단
//		System.out.print("3단 : ");
//		for(int i=1; i<=9; i++) {
//			System.out.print(3+"*"+i+"="+3*i+"\t");
//		} System.out.println();
		
		
		// 이중for문으로 출력하기
		// 큰 for문 : 2~9단(k)까지 반복, k
		// 작은 for문 : 단 내에서 범위(i)를 반복, i
		for(int k=2; k<=9; k++) {
			System.out.print(k+"단 : ");
			for(int i=1; i<=9; i++) {
				System.out.print(k+"*"+i+"="+k*i+"\t");
			} System.out.println();
		}
		
	}

}
