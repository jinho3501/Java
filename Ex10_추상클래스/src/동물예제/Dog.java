package 동물예제;

public class Dog extends Animal {
	
	// Animal추상클래스를 상속받는 경우
	// Animal 클래스에 있는 추상메소드 cry, play를 구현하지 않으면 오류 발생
	
	// 추상메소드는 형태만 있고 구현내용이 없기 때문에 상속을 받은 자식클래스에서
	// 강제적으로 구현해야한다!

	@Override
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public void play() {
		System.out.println("터그놀이");
	}

}
