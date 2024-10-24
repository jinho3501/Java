package for문;

public class Ex05_이중for문세로출력 {
	
	public static void main(String[] args) {
		
//		System.out.print(2+"*"+1+"="+2*1+"\t");
//		System.out.print(3+"*"+1+"="+3*1+"\t");
//		System.out.print(4+"*"+1+"="+4*1+"\t");
//		System.out.println();
//		
//		System.out.print(2+"*"+2+"="+2*2+"\t");
//		System.out.print(3+"*"+2+"="+3*2+"\t");
//		System.out.print(4+"*"+2+"="+4*2+"\t");
//		System.out.println();
//		
//		// 작은 for문 - 단(i) 변화
//		for(int i=2; i<=9; i++) {
//			System.out.print(i+"*"+1+"="+i*1+"\t");
//		}System.out.println();
//		
//		for(int i=2; i<=9; i++) {
//			System.out.print(i+"*"+2+"="+i*2+"\t");
//		}System.out.println();
		
		
		// 큰 for문 - 범위(k) 변화
		for(int k=1; k<=9; k++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+"*"+k+"="+i*k+"\t");
			}System.out.println();
		}
	}

}
