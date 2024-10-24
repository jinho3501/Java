package 자료형;

public class Ex04_기본자료형 {

	public static void main(String[] args) {
		
		// 기본자료형
		
		// 1. 논리형 (true/false) (1byte)
		boolean yes = true;
		boolean no = false;
		
		// 2. 문자형 '' 문자1개만 저장 (2byte)
		char char1 = 'A';
		char char2 = 65; // 유니코드 숫자로도 저장 가능
		
		System.out.println(char1);
		System.out.println(char2);
		
		// 3. 정수형
		// 3-1. byte (1byte) -128 ~ 127
		byte num1 = 127;
		
		// 3-2. short (2byte) -32768 ~ 32767
		short num2 = 32767;
		
		// 3-3. int (4byte) 기본 정수형 타입 -2147483648 ~ 2147483647
		int num3 = 2147483647;
		
		// 3-4. long (8byte)
		long num4 = 2;
		
		
		// 4. 실수형 
		// 4-1. float (4byte) 
		// 소수점 7자리
		float num5 = (float)3.14;
		float num6 = 3.14f;
		
		// 4-2. double (8byte) 기본 실수형 타입
		// 소수점 15자리 -> 조금 더 정확한 데이터 저장이 가능
		double num7 = 3.14;
		
		float num8 = 0.123456789123456789f;
		double num9 = 0.123456789123456789;
		
		// 정밀도 차이
		System.out.println("float : "+num8);
		System.out.println("double : "+num9);
		
		

	}

}







