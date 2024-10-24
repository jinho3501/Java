package 이차원배열;

public class Ex07_이차원배열 {

	public static void main(String[] args) {

		// 이차원 배열 : 1차원 배열 안에 배열이 한번 더 들어가는 구조
		int[] dbScore = new int[27];
		int[] pythonScore = new int[27];
		int[] crawlingScore = new int[27];

		int[][] lgedx3 = new int[3][27];
		lgedx3[0] = dbScore;
		lgedx3[1] = pythonScore;
		lgedx3[2] = crawlingScore;

		// 5행 5열크기의 2차원 배열을 선언하고 1~25까지 초기화
		int[][] arr = new int[5][5];

		// 첫번째줄
		//  k  i
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;

		// 두번째줄
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;

		int cnt = 1; // 값을 대신할 변수

		// 첫번째줄 - for문
		for (int i = 0; i <= 4; i++) {
			arr[0][i] = cnt++;
		}

		// 두번째줄 - for문
		for (int i = 0; i <= 4; i++) {
			arr[1][i] = cnt++;
		}

		// 세번째줄 - for문
		for (int i = 0; i <= 4; i++) {
			arr[2][i] = cnt++;
		}
		
		// 큰 for문
		for(int k=0; k<=4; k++) {
			for (int i = 0; i <= 4; i++) {
				arr[k][i] = cnt++;
			}
		}

	}

}
