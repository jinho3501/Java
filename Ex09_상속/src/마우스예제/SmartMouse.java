package 마우스예제;

public class SmartMouse extends WheelMouse {
	
	// SmartMouse 설계도
	
	// 기능 : 좌클릭, 우클릭, 휠 -> 상속으로 해결
	// 피로감소기능 -> 추가 확장
	
	public void smart() {
		System.out.println("피로감소~");
	}
	
	// 좌클릭, 우클릭 기능을 물려받았으나
	// smart한 기능으로 더블클릭으로 재정의 해보기
	// 메소드 오버라이딩(재정의) : 상속받은 메소드를 재정의하는 것
	public void leftClick() {
		System.out.println("더블 좌클릭");
	}
	
	public void rightClick() {
		System.out.println("더블 우클릭");
	}
	
	

}
