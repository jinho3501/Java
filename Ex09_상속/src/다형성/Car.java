package 다형성;

public class Car extends Vehicle {

	@Override
	public void forward() {
		System.out.print("🚗🚗🚗");
		// super : 부모클래스
		// super.forward() : 부모클래스에 있는 forward메소드 실행
		super.forward();
	}

	@Override
	public void backward() {
		System.out.print("🚗🚗🚗");
		super.backward();
	}
	
	
	

}
