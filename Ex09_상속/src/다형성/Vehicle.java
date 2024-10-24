package 다형성;

public class Vehicle {
	
	// 추상화 작업 : 차와 오토바이 클래스의 공통적인 속성(필드), 기능(메소드)들을 추출하여 
	//            Vehicle클래스(수퍼클래스)를 정의
	
	// 차와 오토바이 클래스는 extends키워드를 통해서 Vehicle의 기능을 상속받아서
	// 동일한 속성, 기능을 따로 정의하지 않아서 생산성 증가, 효율적으로 코드를 작성
	
	// 공통적인 코드의 변경이 있는 경우 한번에 수정해서 모든 클래스에 반영될 수 있도록 유지보수 측면에서 용이
	
	
	// 필드
	String model;
	String color;
	
	// 메소드
	public void forward() {
		System.out.println("앞으로 전진");
	}
	
	public void backward() {
		System.out.println("뒤로 후진");
	}

	// toString : 객체가 가진 정보나 값을 문자열로 리턴을 해주는 메소드
	// 모든 클래스는 Object클래스를 상속받는다! -> Object가 가지고 있는 기능이기 때문에 override라고 뜬다!
	@Override
	public String toString() {
		// 유지보수의 편의성을 확인 가능!
		return "Vehicle [모델=" + model + ", 색깔=" + color + "]";
	}
	
	
	

}
