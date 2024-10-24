package 오버라이딩;

public class Cat extends Animal {

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void play() {
		System.out.println("레이저놀이");
	}
	
	

}
