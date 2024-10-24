package 다형성;

public class MotorBike extends Vehicle {
	
	@Override
	public void forward() {
		System.out.print("🏍️🏍️🏍️");
		super.forward();
	}

	@Override
	public void backward() {
		System.out.print("🏍️🏍️🏍️");
		super.backward();
	}
	

}
