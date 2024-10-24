package for문;

public class Ex06_별찍기 {

	public static void main(String[] args) {

		// 출력문으로 별찍기
//		System.out.print("*");
//		System.out.println();
//
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

		// for문으로 바꾸기
		// 첫번재 줄
//		for (int star = 1; star <= 1; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		// 두번째줄
//		for (int star = 1; star <= 2; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		// 세번째줄
//		for (int star = 1; star <= 3; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		// 큰 for문
		for(int row=1; row <=5; row++ ) {
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
