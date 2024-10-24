package for문;

public class Ex07_별찍기2 {

	public static void main(String[] args) {

		// * 공백5별1
		// ** 공백4별2
		// *** 공백3별3
		// **** 공백2별4
		// ***** 공백1별5

		// 1. 공백 5개
//		for(int i=0; i<5; i++) {
//			System.out.print(" ");
//		}
//		
//		// 1. 별 1개
//		for(int i=0; i<1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// 2. 공백 4개
//		for(int i=0; i<4; i++) {
//			System.out.print(" ");
//		}
//		
//		// 2. 별 2개
//		for(int i=0; i<2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();

		// 큰 for문
		for (int k = 1; k < 6; k++) {
			for (int i = 0; i < 6 - k; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < k; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {
			System.out.println(" ".repeat(6 - i) + "*".repeat(i));
		}

	}

}
