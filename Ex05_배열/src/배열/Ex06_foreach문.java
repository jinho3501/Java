package 배열;

public class Ex06_foreach문 {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		// for-each문
//		for(데이터의타입 변수명 : 반복가능한데이터 ) {
//			
//		}
		System.out.println();
		for(int num : array) {
			System.out.print(num+" ");
		}
	}

}
