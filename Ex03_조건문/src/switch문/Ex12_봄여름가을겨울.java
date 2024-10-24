package switch문;

import java.util.Scanner;

public class Ex12_봄여름가을겨울 {

	public static void main(String[] args) {

		// 월을 입력받아서 계절을 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 2, 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}

		System.out.print("월 입력 : ");
		int month2 = sc.nextInt();

		String season = switch (month2) {
		case 12, 1, 2 -> "겨울";
		case 3, 4, 5 -> "봄";
		case 6, 7, 8 -> "여름";
		case 9, 10, 11 -> "가을";
		default -> "";
		};

		System.out.println(month + "월은 " + season + "입니다!");

	}

}
