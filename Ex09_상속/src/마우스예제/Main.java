package 마우스예제;

public class Main {
	
	public static void main(String[] args) {
		
		// Mouse객체 생성
		Mouse m = new Mouse();
		
		System.out.println("==Mouse==");
		m.leftClick();
		m.rightClick();
		
		// WheelMouse객체 생성
		WheelMouse wm = new WheelMouse();
		
		System.out.println("==WheelMouse==");
		wm.leftClick();
		wm.rightClick();
		wm.wheel();
		
		// WheelMouse 객체 생성
		SmartMouse sm = new SmartMouse();
		
		System.out.println("==SmartMouse==");
		sm.leftClick();
		sm.rightClick();
		sm.wheel();
		sm.smart();
	
	}

}










