package 오버라이딩;

public class Dog extends Animal {
	// 오버라이딩 : 부모클래스(Animal)의 메소드의 동작 방법을 변경
	// : 매개변수의 개수, 순서, 타입 그리고 반환타입은 같아야함!
	
	// 자동 오버라이딩 : 오른쪽마우스 - Source - Override/Implement Methods

	@Override
	public void cry() {
		// super : 수퍼클래스(부모클래스)
//		super.cry();
		System.out.println("멍멍");
	}

	@Override
	public void play() {
		System.out.println("터그놀이");
	}

}
