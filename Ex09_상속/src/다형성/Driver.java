package 다형성;

public class Driver {
	
	// 운전자 클래스
	
	// ver1
	// car
//	public void drive(Car car) {
//		car.forward();
//		car.backward();
//	}
//	
//	// MotorBike
//	public void drive(MotorBike moto) {
//		moto.forward();
//		moto.backward();
//	}
	


	
	// ver2 : 업캐스팅과 다형성을 활용하여 메소드 다시 제작 
	public void drive(Vehicle v) {
		v.forward();
		v.backward();
	}
	
	// ver1에서 운전자는 Car, MotorBike 객체를 매개변수로 전달받아서 운전
	// == 운전자는 Car와 MotorBike 객체에 의존
	// == 운전자 클래스는 두 개의 클래스와 직접적인 관계 
	// == 객체들간의 결합도가 높음!
	// 객체지향프로그래밍에서는 결합도가 높은 것을 선호X
	// why? 이동수단이 2개(Car, MotorBike)만 있어서 괜찮지만 만약 Bus, Train 등이 추가된다면?
	// drive 메소드가 계속 생성되어야 한다.
	// 만약 MotorBike 클래스 명이 Bike로 변경된다고 하면?
	// 수정사항이 있을 때마다 코드를 변경
	
	// 객체지향은 객체들간의 결합도를 낮추고, 
	// 느슨한 관계를 설정하여 보다 유연하게 프로그램을 설계하는것이 핵심 
	
	// ver2에서 다형성을 적용하여 코드를 작성
	// 운전자는 Car, MotorBike의 상위클래스인 Vehicle을 매개변수로 전달 받아서 운전
	// Vehicle을 상속받는 어떤 이동수단이 와도 운전 가능
	// 새로운 drive라는 메소드를 생성할 필요X
	
	// 업캐스팅 : 상위클래스의 타입으로 저장하는 것.
	Car car = new Car();
	Vehicle car2 = new Car();
	
}




