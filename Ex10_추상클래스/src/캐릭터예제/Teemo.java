package 캐릭터예제;

public class Teemo extends Character {
	
	// 티모 캐릭터에 대한 설계도


	public Teemo(String name, String position) {
		super(name, position);
	}

	@Override
	public void q() {
		System.out.println("실명다트! 시야가리기");
	}

	@Override
	public void w() {
		System.out.println("신속한 이동! 빠르게 움직이기");
	}

	@Override
	public void e() {
		System.out.println("맹독 다트! 중독효과");
	}

	@Override
	public void r() {
		System.out.println("유독성 함정! 버섯던지기!");
	}

}
