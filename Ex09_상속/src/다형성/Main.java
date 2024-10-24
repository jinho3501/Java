package 다형성;

public class Main {
	
	public static void main(String[] args) {
		
		// 차와 오토바이 객체 생성
		Car car = new Car();
		MotorBike moto = new MotorBike();
		
		// 상속받은 필드에 값 넣어보기
		car.model = "JEEP";
		car.color = "RED";
		moto.model = "HONDA";
		moto.color = "YELLOW";
		
		// 오버라이딩 된 메소드
		car.forward();
		car.backward();
		moto.forward();
		moto.backward();
		
		// 상속받은 메소드
		System.out.println(car.toString());
		System.out.println(moto.toString());
		
		Driver d = new Driver();
		d.drive(new Car());
		d.drive(new MotorBike());
		
	}

}
