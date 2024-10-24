package 핸드폰예제;

public class FeaturePhone extends Phone {

	// 피처폰의 기본 기능 : 전화 문자 카메라
	
	// 전화, 문자 기능은 Phone에 있기 때문에
	// 메소드를 만들지 않고 상속받아서 활용
	
	public void camera() {
		System.out.println("사진찍기");
	}
}
