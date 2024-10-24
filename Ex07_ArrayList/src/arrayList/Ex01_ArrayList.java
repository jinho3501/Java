package arrayList;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// 1. 선언
		// 배열 : 자료형[] 레퍼런스변수명 = new 자료형[크기];
		int[] intArray = new int[5];
		
		// ArrayList : ArrayList<자료형> 변수명 = new ArrayList<자료형>();
		// import가 필요 : java.util.ArrayList
		// 데이터타입은 객체 타입으로 작성, int -> Integer
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		// 2. 크기 확인
		// 배열 : length
		System.out.println("배열의 크기 : "+intArray.length);

		// ArrayList : size()
		System.out.println("ArrayList의 크기 : "+intArrList.size());
		
		// 3. 값 추가 (1~5까지 채워넣기)
		// 배열 : 변수명[인덱스] = 값;
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = i+1;
		}
		
		// ArrayList : 변수명.add(값);
		for(int i=1; i<=5; i++) {
			intArrList.add(i);
		}
		
		// 원하는 위치에 값 추가 : 변수명.add(인덱스, 값)
		// add 메소드 오버로딩
		intArrList.add(0, 0);
		
		
		System.out.println("값 추가 후 ArrayList의 크기 : "+intArrList.size());
		
		// 4. 값 조회
		// 배열 : 변수명[인덱스]
		System.out.print("배열 : ");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		
		System.out.println();
		System.out.print("ArrayList : ");
		// ArrayList : 변수명.get(인덱스)
		for(int i=0; i<intArrList.size(); i++) {
			System.out.print(intArrList.get(i)+" ");
		}
		
		
		// 5. 삭제
		// 5-1. 원하는 값만 삭제 : 변수명.remove(인덱스)
		// 5-2. 모든 값을 삭제 : 변수명.clear()
		
		// 0번째 값 삭제
		intArrList.remove(0);
		
		System.out.println();
		System.out.print("삭제 후 ArrayList : ");
		for(int i=0; i<intArrList.size(); i++) {
			System.out.print(intArrList.get(i)+" ");
		}
		
		// 전체 삭제
		intArrList.clear();
		
		System.out.println();
		System.out.println("전체 삭제 후 ArrayList의 크기 : "+intArrList.size());
		

	}

}





